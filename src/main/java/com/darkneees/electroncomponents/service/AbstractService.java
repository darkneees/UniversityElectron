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
}
