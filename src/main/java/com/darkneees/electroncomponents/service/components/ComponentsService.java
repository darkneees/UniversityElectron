package com.darkneees.electroncomponents.service.components;

import com.darkneees.electroncomponents.entity.Components;

import java.util.List;

public interface ComponentsService {

    List<Components> getAllComponents();
    void addTypeComponent(Components components);

}
