package com.springboot.example.dao;

import com.springboot.example.models.User;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserDAO {

    User createUser(@RequestBody User user);

    User updateUser(long id);

    User delUser(long id);

    User getUser(long id);

    List<User> getUsers();

}
