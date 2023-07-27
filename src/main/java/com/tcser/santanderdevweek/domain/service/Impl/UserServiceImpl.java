package com.tcser.santanderdevweek.domain.service.Impl;

import com.tcser.santanderdevweek.domain.model.User;
import com.tcser.santanderdevweek.domain.repository.UserRepository;
import com.tcser.santanderdevweek.domain.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account number already exists.");
        }

        return userRepository.save(userToCreate);
    }
}
