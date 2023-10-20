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
public class UserDaoImp implements UserDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public User createUser(@RequestBody User user) {
        return null;
    }

    @Override
    public User updateUser(long dni, @RequestBody User user) {
        return null;
    }

    @Override
    public User delUser(long dni) {
        return null;
    }

    @Override
    public User getUser(long dni) {
        return entityManager.find(User.class, dni);
    }

    @Override
    public List<User> getUsers() {
        return entityManager.createNativeQuery("SELECT * FROM users", User.class).getResultList();
    }

}
