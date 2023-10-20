package com.springboot.example.controllers;

import com.springboot.example.dao.UserDao;
import com.springboot.example.exceptions.BadRequestException;
import com.springboot.example.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @PostMapping("/create")
    public User postUser(@RequestBody User user) {
        return null;
    }

    @DeleteMapping("/deleted/{id}")
    public User delUser(@PathVariable long dni) {
        return new User(123, "Fred", "Myller Tayson", "fred@email.com", "pass123", "user", new Date(), new Date());
    }

    @PutMapping("/update/{id}")
    public User putUser(@PathVariable long dni, @RequestBody User user) {
        return new User(123, "Fred", "Myller Tayson", "fred@email.com", "pass123", "user", new Date(), new Date());
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable long dni) {
        //return userDao.getUser(dni).stream().filter(user_dni -> user_dni.equals(dni)).findFirst().orElseThrow(() -> new BadRequestException(String.format("User wit dni [%s] not exist", dni)));
        return userDao.getUser(dni);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userDao.getUsers();
    }

}
