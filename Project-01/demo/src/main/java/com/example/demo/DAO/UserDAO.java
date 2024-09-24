package com.example.demo.DAO;

import com.example.demo.Entities.UserEntity;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAO {

    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }

    public int addUser(UserEntity user) {
        userRepository.save(user);
        return user.getId();
    }

    public UserEntity getUser(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public String deleteUser(int id) {
        if (!userRepository.existsById(id)) {
            return "User not found!";
        }
        userRepository.deleteById(id);
        return Integer.toString(id);
    }

    public String updateUser(UserEntity user, int id) {
        if (!userRepository.existsById(id)) {
            return "User not found!";
        }
        user.setId(id);
        userRepository.save(user);
        return Integer.toString(id);
    }

    public void deleteAllUser() {
        userRepository.deleteAll();
    }
}
