package com.springboot.example.service;

import com.springboot.example.model.Student;
import com.springboot.example.respository.StudentRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class TeacherService implements StudentRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void createUser(@RequestBody Student student) {
        entityManager.persist(student);
    }

    @Override
    public void updateUser(@RequestBody Student student) {
        entityManager.merge(student);
    }

    @Override
    public void deleteUser(@RequestHeader String email) {
        entityManager.remove(entityManager.find(Student.class, email));
    }

    @Override
    public Student getUser(String email) {
        return entityManager.find(Student.class, email);
    }

    @Override
    public List<Student> getUsers() {
        return entityManager.createQuery("FROM User").getResultList();
    }

}
