package com.notahmed.jwt_demo.service;

import com.notahmed.jwt_demo.entity.Token;
import com.notahmed.jwt_demo.entity.User;
import com.notahmed.jwt_demo.repository.TokenRepository;
import com.notahmed.jwt_demo.repository.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final TokenRepository tokenRepository;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    private final long accessTokenExpiration= 2592000000L;


    public AuthService(UserRepository userRepository, TokenRepository tokenRepository, JwtService jwtService, AuthenticationManager authenticationManager) {
        this.userRepository = userRepository;
        this.tokenRepository = tokenRepository;
        this.jwtService = jwtService;
        this.authenticationManager = authenticationManager;
    }


    public Token signing(String username, String password) {

        // authenticating the user
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(username, password)
        );
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new IllegalArgumentException("Invalid username or password"));


        // find all active tokens by user
        List<Token> activeTokens = tokenRepository.findAllByUserAndIsActive(user, true)
                .orElse(Collections.emptyList());

        if(!activeTokens.isEmpty()) {
            for (Token token: activeTokens) {
                token.setActive(false);
            }
            tokenRepository.saveAll(activeTokens);
        }

        // generate a jwt token with the user object
        String jwtToken = jwtService.generateToken(user);


        Date expiresAt = new Date(System.currentTimeMillis() + accessTokenExpiration);

        // save the generated token in the database
        return tokenRepository.save(new Token(jwtToken, expiresAt, user,true));

    }

}
