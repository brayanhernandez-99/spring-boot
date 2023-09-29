package com.springboot.example.controllers;

import com.springboot.example.models.User;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @RequestMapping(value = "/create")
    public User postUser() {
        return new User(987654321, "Andy", "Miller", "andy@test.com", "pas123", "123456789", 23);
    }

    @RequestMapping(value = "/deleted/{id}")
    public User delUser(@RequestParam long id) {
        return new User(id, "Andy", "Miller", "andy@test.com", "pas123", "123456789", 23);
    }

    @RequestMapping(value = "/update/{id}")
    public User putUser(@RequestParam long id) {
        return new User(id, "Andy", "Miller", "andy@test.com", "pas123", "123456789", 23);
    }

    @RequestMapping(value = "/user/{id}")
    public User getUser(@RequestParam long id) {
        return new User(987654321, "Andy", "Miller", "andy@test.com", "pas123", "123456789", 23);
    }

    @RequestMapping(value = "/users")
    public List<User> getUsers() {
        return List.of(
                new User(123456789, "Leo", "Johnson", "leo@test.com", "pass123", "123456789", 15),
                new User(123456789, "James", "Brown", "james@test.com", "pass123", "987654321", 14),
                new User(987654321, "Andy", "Miller", "andy@test.com", "pass123", "123456789", 23));
    }

}
