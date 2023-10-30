package com.springboot.studentsteachers.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "subjects")
public class Subject {

    @Column(name = "name")
    private String name;

    @Column(name = "teacher")
    private Teacher teacher;

    public Subject(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

}
