package com.rvmagrini.springjpa.repository;

import com.rvmagrini.springjpa.model.Registration;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class RegistrationRepositoryImpl implements RegistrationRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Registration save(Registration registration) {
        entityManager.persist(registration);
        return registration;
    }

}