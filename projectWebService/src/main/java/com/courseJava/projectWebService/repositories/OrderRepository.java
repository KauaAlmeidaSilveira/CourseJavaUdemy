package com.courseJava.projectWebService.repositories;

import com.courseJava.projectWebService.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
