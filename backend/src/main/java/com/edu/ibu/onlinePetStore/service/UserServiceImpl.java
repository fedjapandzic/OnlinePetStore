package com.edu.ibu.onlinePetStore.service;

import com.edu.ibu.onlinePetStore.model.User;
import com.edu.ibu.onlinePetStore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUser(int id) {
        return userRepository.findById(id);
    }
}
