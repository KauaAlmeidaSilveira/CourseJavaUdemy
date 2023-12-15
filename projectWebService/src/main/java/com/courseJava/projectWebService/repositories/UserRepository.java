package com.courseJava.projectWebService.repositories;

import com.courseJava.projectWebService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
