package com.springboot.example.controller;

import com.springboot.example.dao.UserDao;
import com.springboot.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @PostMapping
    public void createUser(@RequestBody User user) {
        userDao.createUser(user);
    }

    @PutMapping
    public void updateUser(@RequestBody User user) {
        userDao.updateUser(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestHeader String email) {
        userDao.deleteUser(email);
    }

    @GetMapping("/{email}")
    public User getUser(@PathVariable String email) {
        //return userDao.getUser(email).stream().filter(user_dni -> user_dni.equals(email)).findFirst().orElseThrow(() -> new BadRequestException(String.format("User wit email [%s] not exist", email)));
        return userDao.getUser(email);
    }

    @GetMapping
    public List<User> getUsers() {
        return userDao.getUsers();
    }

}
