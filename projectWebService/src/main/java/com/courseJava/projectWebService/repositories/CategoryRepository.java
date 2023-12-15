package com.courseJava.projectWebService.repositories;

import com.courseJava.projectWebService.entities.Category;
import com.courseJava.projectWebService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
