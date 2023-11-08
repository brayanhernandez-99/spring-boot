package com.springboot.users.api.repository;

import com.springboot.users.api.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@Repository
public interface UserRepository{

    void createUser(@RequestBody User user);

    void updateUser(@RequestBody User user);

    void deleteUser(@RequestHeader String email);

    User getUser(String email);

    List<User> getUsers();

}
