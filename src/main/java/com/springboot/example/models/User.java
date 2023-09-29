package com.springboot.example.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private long id;
    private String name;
    private String last_name;
    private String email;
    private String password;
    private String phone;
    private int age;
}
