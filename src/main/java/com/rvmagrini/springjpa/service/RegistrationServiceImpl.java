package com.rvmagrini.springjpa.service;

import com.rvmagrini.springjpa.model.Course;
import com.rvmagrini.springjpa.model.Registration;
import com.rvmagrini.springjpa.model.RegistrationReport;
import com.rvmagrini.springjpa.repository.CourseRepository;
import com.rvmagrini.springjpa.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Transactional
    public Registration addRegistration(Registration registration) {
        registration = registrationRepository.save(registration);

        Course course = Course.builder()
                .name("Intro")
                .description("Mandatory Introduction Course")
                .registration(registration).build();

        courseRepository.save(course);

        return registration;
    }

    public List<Registration> findAll() {
        return registrationRepository.findAll();
    }

    public List<RegistrationReport> findAllReports() {
        return registrationRepository.findAllReports();
    }

}
