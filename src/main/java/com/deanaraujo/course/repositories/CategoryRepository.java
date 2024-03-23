package com.deanaraujo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deanaraujo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
