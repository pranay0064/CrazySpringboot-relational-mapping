package com.example.pranay.controller;

import com.example.pranay.api.UserClientRequest;
import com.example.pranay.entity.Address;
import com.example.pranay.entity.User;
import com.example.pranay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @PostMapping("/saveUser")
    public String saveAdd(@RequestBody User user){
        return userService.saveUses(user);
    }

    @PostMapping("/saveUserById")
    public String saveUserById(@RequestBody UserClientRequest userClientRequest){
        return userService.saveUserById(userClientRequest);
    }
}
