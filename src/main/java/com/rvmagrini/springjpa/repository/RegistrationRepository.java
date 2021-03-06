package com.rvmagrini.springjpa.repository;

import com.rvmagrini.springjpa.model.Registration;
import com.rvmagrini.springjpa.model.RegistrationReport;

import java.util.List;

public interface RegistrationRepository {

    Registration save(Registration registration);

    List<Registration> findAll();

    List<RegistrationReport> findAllReports();

}
