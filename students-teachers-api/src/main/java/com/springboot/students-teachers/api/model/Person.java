package com.springboot.studentsteachers.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Data
@NoArgsConstructor
@MappedSuperclass
@Entity
@Table(name = "persons")
public class Person implements Serializable {

    @Id
    @Column(name = "dni")
    protected Long dni;

    @Column(name = "name")
    protected String name;

    @Column(name = "last_name")
    protected String last_name;

    @Column(name = "email")
    protected String email;

    @Column(name = "password")
    protected String password;

    @Column(name = "rol")
    protected String rol;

    @Column(name = "created_at")
    protected Date created_at;

    @Column(name = "updated_at")
    protected Date updated_at;

    public Person(Long dni, String name, String last_name, String email, String password, String rol, Date created_at, Date updated_at) {
        this.dni = dni;
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.rol = rol;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getCurrentDate(Date date) {
        return DateTimeFormatter.ofPattern("d-MMMM-yyyy K:mm:ss a").format(date.toInstant());
    }

}
