package com.springboot.example.dao;

import com.springboot.example.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class UserImplements implements UserDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public User createUser(@RequestBody User user) {
        return null;
    }

    @Override
    public User updateUser(long id) {
        return null;
    }

    @Override
    public User delUser(long id) {
        return null;
    }

    @Override
    public User getUser(long id) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        String query = "SELECT * FROM users";
        return entityManager.createQuery(query).getResultList();
    }

}
