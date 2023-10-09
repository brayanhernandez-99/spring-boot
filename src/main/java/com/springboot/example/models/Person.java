package com.springboot.example.models;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
@Entity @Table(name = "users")
public class Person {

    @Id @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String last_name;

}
