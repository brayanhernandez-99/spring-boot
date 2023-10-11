package com.springboot.example.models;

import lombok.*;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User extends Person {

    @Column(name = "password")
    private String password;

    @Column(name = "rol")
    private String rol;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "updated_at")
    private Date updated_at;

    public User(long id, String name, String last_name, String email, String password, String rol, Date created_at, Date updated_at) {
        super(id, name, last_name, email);
        this.password = password;
        this.rol = rol;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getCurrentTimeStamp() {
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return LocalDateTime.now().format(formatterTime);
    }

}


