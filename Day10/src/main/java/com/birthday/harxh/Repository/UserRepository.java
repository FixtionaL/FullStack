package com.birthday.harxh.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.birthday.harxh.models.User;

public interface UserRepository extends JpaRepository<User,String>{
    Optional<User> findByEmail(String username);
}
