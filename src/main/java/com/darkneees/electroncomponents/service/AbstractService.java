package com.darkneees.electroncomponents.service;

import com.darkneees.electroncomponents.entity.components.ComponentAbstract;
import com.darkneees.electroncomponents.repository.components.CommonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class AbstractService<E extends ComponentAbstract, R extends CommonRepository<E>> implements CommonService<E> {

    protected final R repository;
    private static final Logger log = LoggerFactory.getLogger(AbstractService.class);

    protected AbstractService(R repository) {
        this.repository = repository;
    }

    @Override
    @Async("taskExecutor")
    public CompletableFuture<List<E>> getAllComponents() {
        log.info("Get All Components");
        return CompletableFuture.completedFuture(repository.findAll());
    }

    @Override
    @Async("taskExecutor")
    public CompletableFuture<E> addComponent(E elem) {
        return CompletableFuture.completedFuture(repository.save(elem));
    }

    @Override
    @Async("taskExecutor")
    public CompletableFuture<Void> deleteComponent(Long id) {
        repository.deleteById(id);
        log.info("Delete component");
        return CompletableFuture.completedFuture(null);
    }

    @Override
    @Async("taskExecutor")
    public CompletableFuture<E> getComponentByName(Long id) {
            Optional<E> optionalElement = repository.findById(id);
            if(optionalElement.isPresent()) {
                return CompletableFuture.completedFuture(optionalElement.get());
            } else throw new RuntimeException();
    }

    @Override
    @Async("taskExecutor")
    public CompletableFuture<Integer> changeAmountComponents(Long id, int amount) {
            Optional<E> optionalElem = repository.findById(id);
            if(optionalElem.isPresent()) {
                E element = optionalElem.get();
                int result_amount = element.getAmount() + amount;
                if(result_amount >= 0) {

                    element.setAmount(element.getAmount() + amount);
                    int change_amount = element.getAmount();
                    repository.save(element);
                    return CompletableFuture.completedFuture(change_amount);

                } else return CompletableFuture.completedFuture(-1);
            } else throw new RuntimeException();
    }
}
