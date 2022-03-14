package com.rvmagrini.springjpa.service;

import com.rvmagrini.springjpa.model.Registration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RegistrationService {

    List<Registration> getRegistrations();

    Registration saveRegistration(Registration registration);

}
