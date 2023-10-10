package com.springboot.example.models;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
@Entity @Table(name = "users")
public class User extends Person{

   @Id
   @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "rol")
    private String rol;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @Column(name = "updateAt")
    private LocalDateTime updateAt;

    public User(long id, String name, String last_name, String email, String password, String rol, LocalDateTime createdAt, LocalDateTime updateAt) {
        super(id, name, last_name);
        this.email = email;
        this.password = password;
        this.rol = rol;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

}


