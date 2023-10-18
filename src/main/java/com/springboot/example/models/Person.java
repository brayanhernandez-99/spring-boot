package com.springboot.example.models;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@MappedSuperclass
public class Person {

    @Column(name = "dni")
    protected Long dni;

    @Id
    @Column(name = "email")
    protected String email;

    @Column(name = "name")
    protected String name;

    @Column(name = "last_name")
    protected String last_name;

    public Person(Long dni, String email, String name, String last_name) {
        super();
        this.dni = dni;
        this.email = email;
        this.name = name;
        this.last_name = last_name;
    }

}
