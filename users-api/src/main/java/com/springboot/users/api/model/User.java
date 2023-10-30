package com.springboot.users.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User extends Person implements Serializable {

    @Id
    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "rol")
    private String rol;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "updated_at")
    private Date updated_at;

    public User(Long dni, String name, String last_name, String email, String password, String rol, Date created_at, Date updated_at) {
        super(dni, name, last_name);
        this.email = email;
        this.password = password;
        this.rol = rol;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

}
