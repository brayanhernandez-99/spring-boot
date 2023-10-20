package com.springboot.example.dao;

import com.springboot.example.models.User;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserDao {

    User createUser(@RequestBody User user);

    User updateUser(long dni, @RequestBody User user);

    User delUser(long dni);

    User getUser(long dni);

    List<User> getUsers();

}
