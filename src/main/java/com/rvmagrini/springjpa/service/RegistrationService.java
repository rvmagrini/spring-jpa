package com.rvmagrini.springjpa.service;

import com.rvmagrini.springjpa.model.Registration;

import javax.transaction.Transactional;
import java.util.List;

public interface RegistrationService {

    Registration addRegistration(Registration registration);

    List<Registration> findAll();

}
