package com.springboot.example.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private long id;
    private String name;
    private String last_name;
    private String email;

}
