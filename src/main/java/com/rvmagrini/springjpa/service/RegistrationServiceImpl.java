package com.rvmagrini.springjpa.service;

import com.rvmagrini.springjpa.model.Registration;
import com.rvmagrini.springjpa.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Override
    public List<Registration> getRegistrations() {
        return registrationRepository.findAll();
    }

    @Override
    public Registration saveRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }
}
