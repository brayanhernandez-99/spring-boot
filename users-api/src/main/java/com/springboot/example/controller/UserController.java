package com.springboot.example.controller;

import com.springboot.example.model.User;
import com.springboot.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public void createUser(@RequestBody User user) {
        userRepository.createUser(user);
    }

    @PutMapping
    public void updateUser(@RequestBody User user) {
        userRepository.updateUser(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestHeader String email) {
        userRepository.deleteUser(email);
    }

    @GetMapping("/{email}")
    public User getUser(@PathVariable String email) {
        //return userDao.getUser(email).stream().filter(user_dni -> user_dni.equals(email)).findFirst().orElseThrow(() -> new BadRequestException(String.format("User wit email [%s] not exist", email)));
        return userRepository.getUser(email);
    }

    @GetMapping
    public List<User> getUsers() {
        return userRepository.getUsers();
    }

}
