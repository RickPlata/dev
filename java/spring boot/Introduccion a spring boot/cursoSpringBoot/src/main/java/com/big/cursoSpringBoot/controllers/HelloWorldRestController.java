package com.big.cursoSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldRestController {

    @GetMapping({"/hello", "/hw", "/hola"})
    public String helloWorld() {
        System.out.println("Ruta hello ejecutada");
        return "Hello World";
    }
}
