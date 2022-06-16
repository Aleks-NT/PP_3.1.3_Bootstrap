package com.example.bootstrap.service;

import com.example.bootstrap.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    void addUser(User user);
    void deleteById(Long id);
    User getUserById(Long id);
    void updateUser(User user);
    User getByName(String name);
}
