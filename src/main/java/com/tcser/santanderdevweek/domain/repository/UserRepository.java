package com.tcser.santanderdevweek.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcser.santanderdevweek.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByAccountNumber(String accountNumber);
}

