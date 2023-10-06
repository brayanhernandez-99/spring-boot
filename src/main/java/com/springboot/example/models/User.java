package com.springboot.example.models;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private long id;
    private String name;
    private String last_name;
    private String email;
    private String password;
    private String phone;
    private int age;

    public List<User> getUsers() {
        return List.of(
                new User(123, "Leo", "Johnson", "leo@test.com", "pass123", "123456789", 15),
                new User(1234, "James", "Brown", "james@test.com", "pass123", "987654321", 14),
                new User(12345, "Andy", "Miller", "andy@test.com", "pass123", "123456789", 23)
        );
    }

}
