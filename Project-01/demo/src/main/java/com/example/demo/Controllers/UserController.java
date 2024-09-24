package com.example.demo.Controllers;

import com.example.demo.DTO.UserRequest;
import com.example.demo.DTO.UserResponse;
import com.example.demo.Entities.UserEntity;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Services.UserService;
import com.example.demo.Translators.UserTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/fetch")
    public ResponseEntity<List<UserResponse>> getUsers() {
        return ResponseEntity.ok(userService.getUsers());
    }

    @GetMapping("/fetch/{id}")
    public ResponseEntity<UserResponse> getUser(@PathVariable int id) {
        UserResponse user = userService.getUser(id);
        if(user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addUser(@RequestBody UserRequest user) {
        return ResponseEntity.ok("Id: "+userService.addUser(user));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateUser(@RequestBody UserRequest user, @PathVariable int id) {
        return ResponseEntity.ok("Id: "+ userService.updateUser(user, id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id) {
        return ResponseEntity.ok("Id: "+ userService.deleteUser(id));
    }

    @DeleteMapping("/delete/all")
    public ResponseEntity<String> deleteAllUsers() {
        userService.deleteAllUser();
        return ResponseEntity.ok("Database Erased!");
    }
}
