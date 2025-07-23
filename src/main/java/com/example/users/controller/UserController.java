package com.example.users.controller;

import com.example.users.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final List<User> users = List.of(
        new User(1, "Kishore"),
        new User(2, "Lakshmi")
    );

    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }
}
