package com.big.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){

        model.addAttribute("title", "Hola Mundo SpringBoot");
        model.addAttribute("nombre", "BIG");
        model.addAttribute("lastname", "plata");

        
        return "details";
    }
}
