package com.deanaraujo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deanaraujo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
