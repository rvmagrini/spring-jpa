package com.rvmagrini.springjpa.repository;

import com.rvmagrini.springjpa.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public User save(User user) {
        entityManager.persist(user);
        return user;
    }
}
