package com.darkneees.electroncomponents.service.user;

import com.darkneees.electroncomponents.entity.User;
import com.darkneees.electroncomponents.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    private UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void AddUser(User user) {
        repository.save(user);
    }

    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }
}
