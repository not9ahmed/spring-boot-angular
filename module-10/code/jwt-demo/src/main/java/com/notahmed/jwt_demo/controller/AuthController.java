package com.notahmed.jwt_demo.controller;

import com.notahmed.jwt_demo.entity.Token;
import com.notahmed.jwt_demo.entity.User;
import com.notahmed.jwt_demo.service.AuthService;
import com.notahmed.jwt_demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/auth")
public class AuthController {

    private final AuthService authService;
    private final UserService userService;


    public AuthController(AuthService authService, UserService userService) {
        this.authService = authService;
        this.userService = userService;
    }


    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(userService.register(user));
    }


    @PostMapping("/login")
    public ResponseEntity<?> signing(@RequestBody User user) {
        Token token = authService.signing(user.getUsername(), user.getPassword());

        Map<String, Object> responseBody = Map.of("token", token,
                "role", token.getUser().getRole().name());

        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }


}
