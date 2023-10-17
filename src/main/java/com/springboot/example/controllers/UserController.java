package com.springboot.example.controllers;

import com.springboot.example.dao.UserDao;
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
    public User delUser(@PathVariable long id) {
        return new User(123,"Fred","Myller Tayson","fred@email.com","pass123","user", new Date(), new Date());
    }

    @PutMapping("/update/{id}")
    public User putUser(@PathVariable long id, @RequestBody User user) {
        return new User(123,"Fred","Myller Tayson","fred@email.com","pass123","user", new Date(), new Date());
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable long id) {
        //return new User().getUsers().stream().filter(userId -> userId.equals(id)).get().orElseThrow(() -> new NotFoundException(String.format("User wit id [%s] not exist", id)));
        return null;
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userDao.getUsers();
    }

}
