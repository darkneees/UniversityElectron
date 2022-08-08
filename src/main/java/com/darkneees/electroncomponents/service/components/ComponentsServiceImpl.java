package com.darkneees.electroncomponents.service.components;

import com.darkneees.electroncomponents.entity.Components;
import com.darkneees.electroncomponents.repository.ComponentsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponentsServiceImpl implements ComponentsService {

    private final ComponentsRepository repository;

    public ComponentsServiceImpl(ComponentsRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Components> getAllComponents() {
        return repository.findAll();
    }

    @Override
    public void addTypeComponent(Components component) {
        repository.save(component);
    }
}
