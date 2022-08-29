package com.darkneees.electroncomponents.service.components;

import com.darkneees.electroncomponents.entity.TypeComponent;

import java.util.List;

public interface TypeComponentService {

    List<TypeComponent> getAllTypesComponents();
    void addTypeComponent(TypeComponent typeComponent);
    void addListComponents(List<TypeComponent> components);

}
