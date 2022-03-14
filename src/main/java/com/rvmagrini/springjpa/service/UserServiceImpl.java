package com.rvmagrini.springjpa.service;

import com.rvmagrini.springjpa.model.User;
import com.rvmagrini.springjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
