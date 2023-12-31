package com.springboot.studentsteachers.api.controller;

import com.springboot.studentsteachers.api.respository.StudentRepository;
import com.springboot.studentsteachers.api.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping
    public void createUser(@RequestBody Student student) {
        studentRepository.createUser(student);
    }

    @PutMapping
    public void updateUser(@RequestBody Student student) {
        studentRepository.updateUser(student);
    }

    @DeleteMapping
    public void deleteUser(@RequestHeader String email) {
        studentRepository.deleteUser(email);
    }

    @GetMapping("/{email}")
    public Student getUser(@PathVariable String email) {
        //return userDao.getUser(email).stream().filter(user_dni -> user_dni.equals(email)).findFirst().orElseThrow(() -> new BadRequestException(String.format("User wit email [%s] not exist", email)));
        return studentRepository.getUser(email);
    }

    @GetMapping
    public List<Student> getUsers() {
        return studentRepository.getUsers();
    }

}
