package com.springboot.example.controllers;

import com.springboot.example.models.User;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @RequestMapping(value = "/user/{id}")
    public List<User> getUser(@RequestParam long id) {
        return List.of(
                new User(123456789, "Leo", "Johnson", "leo@test.com", "123456789", 15),
                new User(123456789, "James", "Brown", "james@test.com", "987654321", 24),
                new User(987654321, "Andy", "Miller", "andy@test.com", "123456789", 53));
    }

    @RequestMapping(value = "/users")
    public List<User> getAllUsers() {
        return List.of();
    }

}
