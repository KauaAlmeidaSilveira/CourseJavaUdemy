package com.coursejava.apiRestNoSQL.services;

import com.coursejava.apiRestNoSQL.entities.Post;
import com.coursejava.apiRestNoSQL.repository.PostRepository;
import com.coursejava.apiRestNoSQL.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id) {
        Optional<Post> post = postRepository.findById(id);
        if (post.isEmpty()) {
            throw new ObjectNotFoundException("Object not found");
        }
        return post.get();
    }
}
