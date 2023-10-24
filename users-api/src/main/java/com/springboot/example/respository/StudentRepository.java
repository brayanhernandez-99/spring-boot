package com.springboot.example.respository;

import com.springboot.example.model.Student;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

public interface StudentRepository {

    void createUser(@RequestBody Student student);

    void updateUser(@RequestBody Student student);

    void deleteUser(@RequestHeader String email);

    Student getUser(String email);

    List<Student> getUsers();

}
