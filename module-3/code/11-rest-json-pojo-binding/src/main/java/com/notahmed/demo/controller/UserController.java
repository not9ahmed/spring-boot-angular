package com.notahmed.demo.controller;

import com.notahmed.demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Ahmed", "ahmed@gmail.com"));
        users.add(new User(2, "John", "john@gmail.com"));
        return users;
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
    public String createUser(@RequestBody User user) {
        return "User created with request body: " + user.toString();
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
