package com.estore.E_Store.Services;

import com.estore.E_Store.Models.UserModel;
import com.estore.E_Store.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServices {

    @Autowired
    UserRepository userRepository;

//    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public List<UserModel> getUsers(){
        return userRepository.findAll();
    }

    public UUID addUser(UserModel user) {
        user.setUserId(UUID.randomUUID());
//        String hashedPassword = passwordEncoder.encode(user.getPassword());
//        user.setPassword(hashedPassword);
        userRepository.save(user);
        return user.getUserId();
    }
}
