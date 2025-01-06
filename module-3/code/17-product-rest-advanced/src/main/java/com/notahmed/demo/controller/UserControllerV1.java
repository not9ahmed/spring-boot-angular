package com.notahmed.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/users")
public class UserControllerV1 {

    @GetMapping
    public String findAllUsers() {
        return "Hello from users v1";
    }

}
