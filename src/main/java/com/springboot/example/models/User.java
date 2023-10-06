package com.springboot.example.models;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends Person{

    private String rol;
    private String password;
    private Date createdAt;
    private Date updateAt;

    public User(long id, String name, String last_name, String email, String rol, String password, Date createdAt, Date updateAt) {
        super(id, name, last_name, email);
        this.rol = rol;
        this.password = password;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

}


