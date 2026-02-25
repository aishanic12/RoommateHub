package com.roommatehub.controller;

import com.roommatehub.model.User;
import com.roommatehub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepo;

    // CREATE
    @PostMapping
    public User addUser(@RequestBody User user){
        return userRepo.save(user);
    }

    // READ
    @GetMapping
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }
}
