package com.notahmed.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

//@ControllerAdvice
@RestControllerAdvice
public class GlobalExceptionHandler extends RuntimeException {


//    Generic Exception handler to be catched by single method
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleGenericException (Exception exception) {

        Map<String, Object> body = new HashMap<>();
        body.put("Timestamp", LocalDateTime.now());
        body.put("Error", "Internal Server Error");
        body.put("Message", exception.getMessage());

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(body);
    }



//    @ResponseBody
    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<String> handleResourcetNotFoundException(ResourceNotFound exception) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(exception.getMessage());
    }
}
