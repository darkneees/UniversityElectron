package com.darkneees.electroncomponents.service.user;

import com.darkneees.electroncomponents.entity.User;

import java.util.concurrent.CompletableFuture;

public interface UserService {

    CompletableFuture<User> AddUser(User user);
    CompletableFuture<User> findByUsername(String username);
}
