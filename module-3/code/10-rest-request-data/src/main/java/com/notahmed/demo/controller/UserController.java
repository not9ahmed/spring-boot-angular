package com.notahmed.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getAllUsers() {
        return "List of all users";
    }

    @GetMapping("/search")
    public String searchUser(@RequestParam Map<String, String> params) {
        return "User search of " + params.toString();
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") Integer id) {
        return "User " + id;
    }

    @PostMapping
    public String createUser(@RequestBody String body) {
        return "User created with request body: " + body;
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable("id") Integer id, @RequestBody String body) {
        return "User updated with id: " + id + " and the body is: " + body;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Integer id) {
        return "User deleted with id: " + id;
    }

}
