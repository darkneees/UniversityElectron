package com.darkneees.electroncomponents.service;

import com.darkneees.electroncomponents.entity.Components.ComponentAbstract;
import com.darkneees.electroncomponents.repository.Components.CommonRepository;
import org.springframework.scheduling.annotation.Async;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public abstract class AbstractService<E extends ComponentAbstract, R extends CommonRepository<E>> implements CommonService<E> {

    protected final R repository;


    protected AbstractService(R repository) {
        this.repository = repository;
    }

    @Async("taskExecutor")
    @Override
    public CompletableFuture<List<E>> getAllComponents() {
        return CompletableFuture.completedFuture(repository.findAll());
    }

    @Async("taskExecutor")
    @Override
    public CompletableFuture<Void> addComponent(E elem) {
        return CompletableFuture.runAsync(() -> repository.save(elem));
    }

    @Async("taskExecutor")
    @Override
    public CompletableFuture<Void> deleteComponent(Long id) {
        return CompletableFuture.runAsync(() -> repository.deleteById(id));

    }

    @Async
    @Override
    public CompletableFuture<E> getComponentByName(Long id) {
        return CompletableFuture.completedFuture(repository.findById(id).get());
    }

    @Override
    public CompletableFuture<Integer> changeAmountComponents(Long id, int amount) {
        return CompletableFuture.supplyAsync(() -> {
            E element = repository.findById(id).get();
            int result_amount = element.getAmount() + amount;
            if(result_amount >= 0) {

                element.setAmount(element.getAmount() + amount);
                int change_amount = element.getAmount();
                repository.save(element);
                return change_amount;

            } else return -1;
        });
    }
}
