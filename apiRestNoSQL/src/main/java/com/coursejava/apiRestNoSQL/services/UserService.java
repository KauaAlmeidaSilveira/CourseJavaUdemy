package com.coursejava.apiRestNoSQL.services;

import com.coursejava.apiRestNoSQL.dto.UserDTO;
import com.coursejava.apiRestNoSQL.entities.Post;
import com.coursejava.apiRestNoSQL.entities.User;
import com.coursejava.apiRestNoSQL.repository.UserRepository;
import com.coursejava.apiRestNoSQL.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(String id){
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()){
            throw new ObjectNotFoundException("Object not found");
        }
        return user.get();
    }

    public User insert(User obj){
        return userRepository.insert(obj);
    }

    public void delete(String id){
        findById(id);
        userRepository.deleteById(id);
    }

    public void update(User newUser, String id){
        User oldUser = findById(id);
        updateData(oldUser, newUser);
        userRepository.save(oldUser);
    }

    public void updateData(User oldUser, User newUser){
        oldUser.setName(newUser.getName());
        oldUser.setEmail(newUser.getEmail());
    }

    public List<Post> findPosts(String idUser){
        User user = findById(idUser);
        return user.getPosts();
    }

    public User fromDTO(UserDTO userDTO){
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }
}
