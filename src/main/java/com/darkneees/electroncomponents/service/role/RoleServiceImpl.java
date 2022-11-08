package com.darkneees.electroncomponents.service.role;

import com.darkneees.electroncomponents.entity.Role;
import com.darkneees.electroncomponents.repository.RoleRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository repository;

    public RoleServiceImpl(RoleRepository repository) {
        this.repository = repository;
    }

    @Override
    @Async("taskExecutor")
    public CompletableFuture<Role> addRole(Role role) {
        return CompletableFuture.completedFuture(repository.save(role));
    }
}
