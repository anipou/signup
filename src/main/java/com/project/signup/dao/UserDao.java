package com.project.signup.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.signup.entities.User;

public interface UserDao extends JpaRepository<User, Long> { 

}
 