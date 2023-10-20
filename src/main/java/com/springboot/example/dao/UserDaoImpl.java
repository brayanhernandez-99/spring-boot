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
        entityManager.persist(user);
    }

    @Override
    public void updateUser(@RequestBody User user) {
        entityManager.merge(user);
    }

    @Override
    public void deleteUser(@RequestHeader String email) {
        entityManager.remove(entityManager.find(User.class, email));
    }

    @Override
    public User getUser(String email) {
        return entityManager.find(User.class, email);
    }

    @Override
    public List<User> getUsers() {
        return entityManager.createQuery("FROM User").getResultList();
    }

}
