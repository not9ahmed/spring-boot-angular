package com.notahmed.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getAllUsers() {
        return "List of all users";
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") String id) {
        return "User " + id;
    }

    @PostMapping
    public String createUser() {
        return "User created";
    }

    @PutMapping
    public String updateUser() {
        return "User updated";
    }

    @DeleteMapping
    public String deleteUser() {
        return "User deleted";
    }

}
