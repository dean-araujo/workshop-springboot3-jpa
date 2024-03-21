package com.deanaraujo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deanaraujo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
