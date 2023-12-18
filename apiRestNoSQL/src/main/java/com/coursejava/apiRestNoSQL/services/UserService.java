package com.coursejava.apiRestNoSQL.services;

import com.coursejava.apiRestNoSQL.entities.User;
import com.coursejava.apiRestNoSQL.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

}
