package com.notahmed.jwt_demo.config;

import com.notahmed.jwt_demo.repository.TokenRepository;
import com.notahmed.jwt_demo.repository.UserRepository;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {
    private final UserRepository userRepository;
    private final TokenRepository tokenRepository;

    public DatabaseConfig(UserRepository userRepository, TokenRepository tokenRepository) {
        this.userRepository = userRepository;
        this.tokenRepository = tokenRepository;
    }


}
