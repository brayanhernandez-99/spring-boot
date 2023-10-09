package com.springboot.example.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
@Entity @Table(name = "users")
public class Person {

    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String last_name;

}
