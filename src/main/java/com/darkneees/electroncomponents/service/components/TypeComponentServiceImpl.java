package com.darkneees.electroncomponents.service.components;

import com.darkneees.electroncomponents.entity.TypeComponent;
import com.darkneees.electroncomponents.repository.TypeComponentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeComponentServiceImpl implements TypeComponentService {

    private final TypeComponentRepository repository;

    public TypeComponentServiceImpl(TypeComponentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<TypeComponent> getAllTypesComponents() {
        return repository.findAll();
    }

    @Override
    public void addTypeComponent(TypeComponent component) {
        repository.save(component);
    }
}
