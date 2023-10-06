package com.springboot.example.dao;

import com.springboot.example.models.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();

}
