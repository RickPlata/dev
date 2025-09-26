package com.big.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springFramework.ui.Model;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){

        model.addAtribute("title", "Hola Mundo SpringBoot");
        model.addAtribute("nombre", "BIG");
        model.addAtribute("lastname", "plata");

        
        return "details";
    }
}
