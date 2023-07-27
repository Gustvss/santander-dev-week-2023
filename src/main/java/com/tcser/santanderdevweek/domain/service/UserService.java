package com.tcser.santanderdevweek.domain.service;

import com.tcser.santanderdevweek.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
