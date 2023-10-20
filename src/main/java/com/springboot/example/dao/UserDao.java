package com.springboot.example.dao;

import com.springboot.example.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

public interface UserDao {

    void createUser(@RequestBody User user);

    void updateUser(@RequestBody User user);

    void delUser(@RequestHeader String email);

    User getUser(String email);

    List<User> getUsers();

}
