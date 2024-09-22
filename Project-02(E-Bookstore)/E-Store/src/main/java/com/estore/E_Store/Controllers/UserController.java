package com.estore.E_Store.Controllers;

import com.estore.E_Store.Models.UserModel;
import com.estore.E_Store.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserServices userServices;

    @GetMapping("/all")
    public List<UserModel> getUsers() {
        return userServices.getUsers();
    }

    @PostMapping("/add")
    public UUID addUser(@RequestBody UserModel user) {
        return userServices.addUser(user);
    }

}
