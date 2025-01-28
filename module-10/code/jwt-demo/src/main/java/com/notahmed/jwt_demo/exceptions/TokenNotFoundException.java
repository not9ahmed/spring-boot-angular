package com.notahmed.jwt_demo.exceptions;

public class TokenNotFoundException extends RuntimeException {

    public TokenNotFoundException(String token) {
        super("Token is invalid: " +token);
    }
}
