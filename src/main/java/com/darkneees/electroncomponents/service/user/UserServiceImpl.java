package com.darkneees.electroncomponents.service.user;

import com.darkneees.electroncomponents.entity.User;
import com.darkneees.electroncomponents.repository.UserRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    @Async("taskExecutor")
    public CompletableFuture<User> AddUser(User user) {
        return CompletableFuture.completedFuture(repository.save(user));
    }

    @Override
    @Async("taskExecutor")
    public CompletableFuture<User> findByUsername(String username) {
        return CompletableFuture.completedFuture(repository.findByUsername(username));
    }
}
