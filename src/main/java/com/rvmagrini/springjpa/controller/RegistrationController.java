package com.rvmagrini.springjpa.controller;

import com.rvmagrini.springjpa.model.Registration;
import com.rvmagrini.springjpa.model.RegistrationReport;
import com.rvmagrini.springjpa.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

@Controller
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Registration registration) {
        return "registration";
    }

    @GetMapping("registrations")
    public @ResponseBody List<Registration> getRegistrations() {
        List<Registration> registrations = registrationService.findAll();
        return registrations;
    }

    @GetMapping("registration-reports")
    public @ResponseBody List<RegistrationReport> getRegistrationReports() {
        List<RegistrationReport> registrationReports = registrationService.findAllReports();
        return registrationReports;
    }

    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute("registration") Registration registration,
                                  BindingResult result) {
        if (result.hasErrors()) {
            System.out.println("There were errors");
            return "registration";
        } else {
            registrationService.addRegistration(registration);
        }

        return "redirect:";
    }

}
