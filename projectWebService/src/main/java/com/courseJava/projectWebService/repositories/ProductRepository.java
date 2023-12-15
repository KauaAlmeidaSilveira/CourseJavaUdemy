package com.courseJava.projectWebService.repositories;

import com.courseJava.projectWebService.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
