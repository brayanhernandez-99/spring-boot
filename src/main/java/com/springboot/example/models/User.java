package com.springboot.example.models;

import lombok.*;

@Data
@NoArgsConstructor
public class User {

    private Long id;
    private String name;
    private String last_name;
    private String email;
    private String password;
    private String phone;
    private Integer age;
}
