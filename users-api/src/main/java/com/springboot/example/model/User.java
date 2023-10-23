package com.springboot.example.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User extends Person implements Serializable {

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

    public String getCurrentDate(Date date) {
        return DateTimeFormatter.ofPattern("d-MMMM-yyyy K:mm:ss a").format(date.toInstant());
    }

}


