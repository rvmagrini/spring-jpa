package com.rvmagrini.springjpa.service;

import com.rvmagrini.springjpa.model.Registration;
import com.rvmagrini.springjpa.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Transactional
    public Registration addRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }
}
