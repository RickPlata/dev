package com.big.cursoSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingController {

    @GetMapping({"/saludar/{name}", "/greeting/{name}"})
    public String Greeting(@PathVariable String name) {
        return "Hola " + name;
    }

}
