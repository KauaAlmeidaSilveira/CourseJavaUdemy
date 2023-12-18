package com.coursejava.apiRestNoSQL.resources;

import com.coursejava.apiRestNoSQL.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User user1 = new User("1", "kaua", "kaua@gmail");
        User user2 = new User("2", "nary", "nary@gmail");
        User user3 = new User("3", "gleice", "gleice@gmail");
        return ResponseEntity.status(200).body(Arrays.asList(user1, user2, user3));
    }

}
