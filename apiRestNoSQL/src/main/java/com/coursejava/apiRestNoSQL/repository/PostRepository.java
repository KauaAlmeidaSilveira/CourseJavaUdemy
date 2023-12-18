package com.coursejava.apiRestNoSQL.repository;

import com.coursejava.apiRestNoSQL.entities.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
