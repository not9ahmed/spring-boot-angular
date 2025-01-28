package com.notahmed.jwt_demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TokenNotFoundAdvice {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    String notFoundHandler(TokenNotFoundException ex) {
        return ex.getMessage();
    }

}
