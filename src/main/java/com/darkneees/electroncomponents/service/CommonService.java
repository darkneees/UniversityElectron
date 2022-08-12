package com.darkneees.electroncomponents.service;

import com.darkneees.electroncomponents.entity.Components.ComponentAbstract;

import java.util.List;

public interface CommonService <E extends ComponentAbstract> {

    List<E> getAllComponents();

}
