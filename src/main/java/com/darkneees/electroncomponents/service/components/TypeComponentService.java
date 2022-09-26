package com.darkneees.electroncomponents.service.components;

import com.darkneees.electroncomponents.entity.TypeComponent;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface TypeComponentService {

    CompletableFuture<List<TypeComponent>> getAllTypesComponents();
    void addTypeComponent(TypeComponent typeComponent);
    void addListComponents(List<TypeComponent> components);

}
