package com.example.demo.Services;

import com.example.demo.DAO.UserDAO;
import com.example.demo.DTO.UserRequest;
import com.example.demo.DTO.UserResponse;
import com.example.demo.Entities.UserEntity;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Translators.UserTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private UserTranslator userTranslator;

    public List<UserResponse> getUsers() {
        return userTranslator.entityToResponse(userDAO.getUsers());
    }

    public int addUser(UserRequest user) {
        return userDAO.addUser(userTranslator.requestToEntity(user));
    }

    public UserResponse getUser(int id) {
        return userTranslator.entityToResponse(userDAO.getUser(id));
    }

    public String deleteUser(int id) {
        return userDAO.deleteUser(id);
    }

    public String updateUser(UserRequest user, int id) {
        return userDAO.updateUser(userTranslator.requestToEntity(user), id);
    }

    public void deleteAllUser() {
        userDAO.deleteAllUser();
    }
}
