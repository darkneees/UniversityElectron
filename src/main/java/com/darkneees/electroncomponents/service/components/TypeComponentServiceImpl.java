package com.darkneees.electroncomponents.service.components;

import com.darkneees.electroncomponents.entity.TypeComponent;
import com.darkneees.electroncomponents.repository.TypeComponentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class TypeComponentServiceImpl implements TypeComponentService {

    private final TypeComponentRepository repository;

    public TypeComponentServiceImpl(TypeComponentRepository repository) {
        this.repository = repository;
    }

    @Override
    public CompletableFuture<List<TypeComponent>> getAllTypesComponents() {
        return CompletableFuture.completedFuture(repository.findAll());
    }

    @Override
    public void addTypeComponent(TypeComponent component) {
        repository.save(component);
    }

    @Override
    public void addListComponents(List<TypeComponent> components) {
        repository.saveAll(components);
    }
}
