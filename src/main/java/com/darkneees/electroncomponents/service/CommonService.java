package com.darkneees.electroncomponents.service;

import com.darkneees.electroncomponents.entity.Components.ComponentAbstract;

import java.util.List;

public interface CommonService <E extends ComponentAbstract> {

    List<E> getAllComponents();
    void addComponent(E elem);
    void deleteComponent(E elem);
    E getComponentById(Long id);
    int changeAmountComponents(Long id, int amount);

}
