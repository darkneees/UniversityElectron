package com.darkneees.electroncomponents.service;

import com.darkneees.electroncomponents.entity.Components.ComponentAbstract;
import com.darkneees.electroncomponents.repository.Components.CommonRepository;

import java.util.List;

public abstract class AbstractService<E extends ComponentAbstract, R extends CommonRepository<E>> implements CommonService<E> {

    protected final R repository;


    protected AbstractService(R repository) {
        this.repository = repository;
    }

    @Override
    public List<E> getAllComponents() {
        return (List<E>) repository.findAll();
    }

    @Override
    public void addComponent(E elem) {
        repository.save(elem);
    }

    @Override
    public void deleteComponent(E elem) {
        repository.delete(elem);
    }

    @Override
    public E getComponentById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public int changeAmountComponents(Long id, int amount) {
        E element = getComponentById(id);
        int result_amount = element.getAmount() + amount;
        if(result_amount >= 0) {

            element.setAmount(element.getAmount() + amount);
            int change_amount = element.getAmount();
            repository.save(element);
            return change_amount;

        } else return -1;

    }
}
