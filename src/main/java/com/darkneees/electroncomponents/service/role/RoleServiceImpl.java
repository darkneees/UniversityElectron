package com.darkneees.electroncomponents.service.role;

import com.darkneees.electroncomponents.entity.Role;
import com.darkneees.electroncomponents.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository repository;

    public RoleServiceImpl(RoleRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addRole(Role role) {
        repository.save(role);
    }
}
