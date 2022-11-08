package com.darkneees.electroncomponents.service;

import com.darkneees.electroncomponents.entity.components.ComponentAbstract;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface CommonService <E extends ComponentAbstract> {

    CompletableFuture<List<E>> getAllComponents();
    CompletableFuture<E> addComponent(E elem);
    CompletableFuture<Void> deleteComponent(Long elem);
    CompletableFuture<E> getComponentByName(Long name);
    CompletableFuture<Integer> changeAmountComponents(Long name, int amount);

}
