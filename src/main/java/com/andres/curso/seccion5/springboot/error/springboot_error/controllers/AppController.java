package com.andres.curso.seccion5.springboot.error.springboot_error.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AppController {

    @GetMapping("/app")
    public String index() {
        int value = 10 / 0;
        System.out.println("value: " + value);
        return "ok 200";
    }
    
}
