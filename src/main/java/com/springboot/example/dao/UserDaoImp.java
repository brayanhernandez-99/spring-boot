package com.springboot.example.dao;

import com.springboot.example.exceptions.BadRequestException;
import com.springboot.example.exceptions.NotFoundException;
import com.springboot.example.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
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
    public User getUser(long dni) throws Throwable {
        return (User) entityManager.createNativeQuery("SELECT * FROM users WHERE users.dni = ?1").
                setParameter(1, dni).getResultList().stream().filter(user_dni -> user_dni.equals(dni)).
                findFirst().orElseThrow(() -> new NotFoundException(String.format("Error dni %s not exist", dni)));
    }

    @Override
    public List<User> getUsers() {
        String query = "SELECT * FROM users";
        return entityManager.createNativeQuery(query, User.class).getResultList();
    }

}
