package com.springsecurity.spring_security_td.controller;

import com.springsecurity.spring_security_td.model.User;
import com.springsecurity.spring_security_td.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@CrossOrigin
public class UserController {
    private UserService userService;

    @GetMapping("/")
    public String hello(){ return "Hello World";}

    @GetMapping("/users")
    public List<User> getUsers(){ return userService.getAll();}

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable Long userId){
        return userService.getById(userId);
    }

    @PostMapping("/users")
    public List<User> saveUsers(@RequestBody List<User> users){
        return userService.saveAll(users);
    }
}
