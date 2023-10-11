package com.springboot.example.models;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class Person{

    @Column(name = "dni")
    private Long dni;

    @Id
    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String last_name;

    public Person(Long dni, String email, String name, String last_name) {
        this.dni = dni;
        this.email = email;
        this.name = name;
        this.last_name = last_name;
    }
}
