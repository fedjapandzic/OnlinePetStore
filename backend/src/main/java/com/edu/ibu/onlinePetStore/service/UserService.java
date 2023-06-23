package com.edu.ibu.onlinePetStore.service;

import com.edu.ibu.onlinePetStore.model.User;

import java.util.Optional;

public interface UserService {
    public User saveUser(User user);
    public User getUser(int id);
}
