package com.springboot.example.controllers;

import com.springboot.example.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/create")
    public User postUser() {
        //return new User(987654321L, "Andy", "Miller", "andy@test.com", "pas123", "123456789", 23);
        return null;
    }

    @DeleteMapping("/deleted/{id}")
    public User delUser(@PathVariable long id, @RequestBody User user) {
        //return new User(id, "Andy", "Miller", "andy@test.com", "pas123", "123456789", 23);
        return null;
    }

    @PutMapping("/update/{id}")
    public User putUser(@PathVariable long id, @RequestBody User user) {
        //return new User(id, "Andy", "Miller", "andy@test.com", "pas123", "123456789", 23);
        return null;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable long id) {
        //return new User().getUsers().stream().filter(userId -> userId.equals(id)).get().orElseThrow(() -> new NotFoundException(String.format("User wit id [%s] not exist", id)));
        return null;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return null;
    }

}
