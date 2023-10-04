package com.springboot.example.controllers;

import com.springboot.example.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/create")
    public User postUser() {
        return new User(987654321L, "Andy", "Miller", "andy@test.com", "pas123", "123456789", 23);
    }

    @DeleteMapping("/deleted/{id}")
    public User delUser(@PathVariable long id, @RequestBody User user) {
        return new User(id, "Andy", "Miller", "andy@test.com", "pas123", "123456789", 23);
    }

    @PutMapping("/update/{id}")
    public User putUser(@PathVariable long id, @RequestBody User user) {
        return new User(id, "Andy", "Miller", "andy@test.com", "pas123", "123456789", 23);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable long id) {
        return new User(id, "Andy", "Miller", "andy@test.com", "pas123", "123456789", 23);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return List.of(
                new User(123456789L, "Leo", "Johnson", "leo@test.com", "pass123", "123456789", 15),
                new User(123456789L, "James", "Brown", "james@test.com", "pass123", "987654321", 14),
                new User(987654321L, "Andy", "Miller", "andy@test.com", "pass123", "123456789", 23));
    }

}
