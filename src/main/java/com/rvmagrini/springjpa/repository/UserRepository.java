package com.rvmagrini.springjpa.repository;

import com.rvmagrini.springjpa.model.User;

public interface UserRepository {

    User save(User user);

}
