package com.edu.ibu.onlinePetStore.controller;

import com.edu.ibu.onlinePetStore.exception.UserNotFoundException;
import com.edu.ibu.onlinePetStore.model.User;
import com.edu.ibu.onlinePetStore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody User user){
        userService.saveUser(user);
        return user.getEmail() + " successfully added!";
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") int id){
        User user = userService.getUser(id);
        if (user == null){
            throw new UserNotFoundException("User not found with ID: " + id);
        }
        return user;
    }
}
