package com.andres.curso.seccion5.springboot.error.springboot_error.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.andres.curso.seccion5.springboot.error.springboot_error.models.Error;

@RestControllerAdvice
public class ErrorHandlerExceptionController {


    @ExceptionHandler({ArithmeticException.class})
    public ResponseEntity<?> divisionByZero(Exception ex){

        return ResponseEntity.internalServerError().body("error 500");
        
    }
}
