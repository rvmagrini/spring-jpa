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

        List<RegistrationReport> registrationReports = entityManager
                .createNamedQuery(Registration.REGISTRATION_REPORT).getResultList();

        return registrationReports;
    }

}
