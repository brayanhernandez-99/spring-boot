package com.springboot.studentsteachers.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student extends Person implements Serializable {

    @Column(name = "subjects")
    private List<Subject> subjects;

    public Student(Long dni, String name, String last_name, String email, String password, String rol, Date created_at, Date updated_at, List<Subject> subjects) {
        super(dni, name, last_name, email, password, rol, created_at, updated_at);
        this.subjects = subjects;
    }

}
