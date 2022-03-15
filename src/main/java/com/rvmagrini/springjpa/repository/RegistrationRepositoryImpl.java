package com.rvmagrini.springjpa.repository;

import com.rvmagrini.springjpa.model.Registration;
import com.rvmagrini.springjpa.model.RegistrationReport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RegistrationRepositoryImpl implements RegistrationRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Registration save(Registration registration) {
        entityManager.persist(registration);
        return registration;
    }

    public List<Registration> findAll() {
        List<Registration> registrations = entityManager
                .createQuery("Select r from Registration r").getResultList();

        return registrations;
    }

    public List<RegistrationReport> findAllReports() {
        String jpql = "Select new com.rvmagrini.springjpa.model.RegistrationReport" +
                "(r.name, c.name, c.description) " +
                "from Registration r, Course c " +
                "where r.id = c.registration.id";

        List<RegistrationReport> registrationReports = entityManager
                .createQuery(jpql).getResultList();

        return registrationReports;
    }

}
