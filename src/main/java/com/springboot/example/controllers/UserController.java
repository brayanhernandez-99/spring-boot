package com.springboot.example.controllers;

import com.springboot.example.dao.UserDAO;
import com.springboot.example.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDAO userDAO;

    @PostMapping("/create")
    public User postUser(@RequestBody User user) {
        return userDAO.createUser(user);
    }

    @DeleteMapping("/deleted/{id}")
    public User delUser(@PathVariable long id) {
        return userDAO.delUser(id);
    }

    @PutMapping("/update/{id}")
    public User putUser(@PathVariable long id, @RequestBody User user) {
        return null;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable long id) {
        //return new User().getUsers().stream().filter(userId -> userId.equals(id)).get().orElseThrow(() -> new NotFoundException(String.format("User wit id [%s] not exist", id)));
        return null;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

}
