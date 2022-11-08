package com.darkneees.electroncomponents.service.components;

import com.darkneees.electroncomponents.entity.TypeComponent;
import com.darkneees.electroncomponents.repository.TypeComponentRepository;
import org.springframework.scheduling.annotation.Async;
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
    @Async("taskExecutor")
    public CompletableFuture<List<TypeComponent>> getAllTypesComponents() {
        return CompletableFuture.completedFuture(repository.findAll());
    }

    @Override
    @Async
    public CompletableFuture<TypeComponent> addTypeComponent(TypeComponent component) {
        return CompletableFuture.completedFuture(repository.save(component));
    }

    @Override
    @Async
    public CompletableFuture<List<TypeComponent>> addListComponents(List<TypeComponent> components) {
        return CompletableFuture.completedFuture(repository.saveAll(components));
    }
}
