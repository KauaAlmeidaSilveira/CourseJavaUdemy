package com.courseJava.projectWebService.repositories;

import com.courseJava.projectWebService.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
