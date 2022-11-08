package com.darkneees.electroncomponents.service.role;

import com.darkneees.electroncomponents.entity.Role;

import java.util.concurrent.CompletableFuture;

public interface RoleService {

    CompletableFuture<Role> addRole(Role role);
}
