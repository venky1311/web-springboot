 package com.venky.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venky.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
