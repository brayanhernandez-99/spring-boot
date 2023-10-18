package com.springboot.example.dao;

import com.springboot.example.models.User;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserDao {

    User createUser(@RequestBody User user);

    User updateUser(long id, @RequestBody User user);

    User delUser(long id);

    User getUser(long id) throws Throwable;

    List<User> getUsers();

}
