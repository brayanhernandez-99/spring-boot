package com.springboot.example.repository;

import com.springboot.example.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

public interface TeacherRepository {

    void createUser(@RequestBody User user);

    void updateUser(@RequestBody User user);

    void deleteUser(@RequestHeader String email);

    User getUser(String email);

    List<User> getUsers();

}
