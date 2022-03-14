package com.rvmagrini.springjpa.controller;

import com.rvmagrini.springjpa.model.User;
import com.rvmagrini.springjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("user")
    public String getUser(@ModelAttribute("user") User user) {
        return "user";
    }

    @PostMapping("user")
    public String addUser(@Valid @ModelAttribute("user") User user,
                                  BindingResult result) {
        if (result.hasErrors()) {
            System.out.println("There were errors");
            return "user";
        } else {
            userService.addUser(user);
        }

        return "redirect:";
    }

}
