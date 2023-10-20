package com.springboot.example.dao;

import com.springboot.example.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void createUser(@RequestBody User user) {

    }

    @Override
    public void updateUser(@RequestBody User user) {

    }

    @Override
    public void delUser(@RequestHeader String email) {
        User user = entityManager.find(User.class, dni);
        entityManager.remove(user);
    }

    @Override
    public User getUser(long dni) {
        return entityManager.find(User.class, dni);
    }

    @Override
    public List<User> getUsers() {
        return entityManager.createQuery("FROM User").getResultList();
    }

}
