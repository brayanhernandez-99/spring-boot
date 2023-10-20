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
    public User postUser(@RequestBody User user) {
        return user;
    }

    @PutMapping
    public User putUser(@RequestBody User user) {
        return user;
    }

    @DeleteMapping
    public void delUser(@RequestHeader String email) {
        userDao.delUser(email);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable long dni) {
        //return userDao.getUser(dni).stream().filter(user_dni -> user_dni.equals(dni)).findFirst().orElseThrow(() -> new BadRequestException(String.format("User wit dni [%s] not exist", dni)));
        return userDao.getUser(dni);
    }

    @GetMapping
    public List<User> getUsers() {
        return userDao.getUsers();
    }

}
