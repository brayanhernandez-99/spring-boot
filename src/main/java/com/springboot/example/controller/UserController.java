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
<<<<<<< HEAD
    public User postUser(@RequestBody User user) {
        return user;
    }

    @PutMapping
    public User putUser(@RequestBody User user) {
        return user;
=======
    public void postUser(@RequestBody User user) {
        userDao.createUser(user);
    }

    @PutMapping
    public void putUser(@RequestBody User user) {
        userDao.updateUser(user);
>>>>>>> 831c154 (finish files api)
    }

    @DeleteMapping
    public void delUser(@RequestHeader String email) {
        userDao.delUser(email);
    }

<<<<<<< HEAD
    @GetMapping("/{id}")
    public User getUser(@PathVariable long dni) {
        //return userDao.getUser(dni).stream().filter(user_dni -> user_dni.equals(dni)).findFirst().orElseThrow(() -> new BadRequestException(String.format("User wit dni [%s] not exist", dni)));
        return userDao.getUser(dni);
=======
    @GetMapping("/{email}")
    public User getUser(@PathVariable String email) {
        //return userDao.getUser(dni).stream().filter(user_dni -> user_dni.equals(dni)).findFirst().orElseThrow(() -> new BadRequestException(String.format("User wit dni [%s] not exist", dni)));
        return userDao.getUser(email);
>>>>>>> 831c154 (finish files api)
    }

    @GetMapping
    public List<User> getUsers() {
        return userDao.getUsers();
    }

}
