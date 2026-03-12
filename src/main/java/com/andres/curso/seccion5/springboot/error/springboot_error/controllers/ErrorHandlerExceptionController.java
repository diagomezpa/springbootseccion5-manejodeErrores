package com.andres.curso.seccion5.springboot.error.springboot_error.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.andres.curso.seccion5.springboot.error.springboot_error.models.Error;

import io.micrometer.core.ipc.http.HttpSender.Response;

@RestControllerAdvice
public class ErrorHandlerExceptionController {


    @ExceptionHandler({ArithmeticException.class})
    public ResponseEntity<Error> divisionByZero(Exception ex){
        Error error = new Error();
        error.setMessage(ex.getMessage());
        error.setError("Division by zero");
        error.setStatus(500);
        error.setDate(new java.util.Date());

        //return ResponseEntity.internalServerError().body(error);
        return ResponseEntity.status(500).body(error);
        
        
        
    }
}
