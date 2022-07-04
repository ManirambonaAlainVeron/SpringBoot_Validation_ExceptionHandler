package com.example.validation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.validation.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
