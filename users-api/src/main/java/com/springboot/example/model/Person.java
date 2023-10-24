package com.springboot.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Data
@NoArgsConstructor
@MappedSuperclass
public class Person {

    @Column(name = "dni")
    protected Long dni;

    @Column(name = "name")
    protected String name;

    @Column(name = "last_name")
    protected String last_name;

    public Person(Long dni, String name, String last_name) {
        this.dni = dni;
        this.name = name;
        this.last_name = last_name;
    }

    public String getCurrentDate(Date date) {
        return DateTimeFormatter.ofPattern("d-MMMM-yyyy K:mm:ss a").format(date.toInstant());
    }

}
