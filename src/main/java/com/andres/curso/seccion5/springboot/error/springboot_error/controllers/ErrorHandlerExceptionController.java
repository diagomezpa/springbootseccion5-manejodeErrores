package com.andres.curso.seccion5.springboot.error.springboot_error.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

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


    @ExceptionHandler({NoHandlerFoundException.class})
    public ResponseEntity<Error> notFoundEx (NoHandlerFoundException ex){

        Error error = new Error();
        error.setMessage(ex.getMessage());
        error.setError("Not found");
        error.setStatus(404);
        error.setDate(new java.util.Date());

        return ResponseEntity.status(404).body(error);

    }

    @ExceptionHandler({NumberFormatException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, Object> numberFormatException (NumberFormatException ex){

        Map<String, Object> error = new HashMap<>();
        error.put("message", ex.getMessage());
        error.put("error", "Number format exception");
        error.put("status", 400);
        error.put("date", new java.util.Date());

        return error;

    }






}
