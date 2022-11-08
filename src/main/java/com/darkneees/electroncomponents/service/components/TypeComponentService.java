package com.darkneees.electroncomponents.service.components;

import com.darkneees.electroncomponents.entity.TypeComponent;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface TypeComponentService {

    CompletableFuture<List<TypeComponent>> getAllTypesComponents();
    CompletableFuture<TypeComponent> addTypeComponent(TypeComponent typeComponent);
    CompletableFuture<List<TypeComponent>> addListComponents(List<TypeComponent> components);

}
