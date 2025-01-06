package com.notahmed.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v2/users")
public class UserControllerV2 {

    @GetMapping
    public String findAllUsers() {
        return "Hello from users v2";
    }

}
