package com.big.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.big.curso.springboot.webapp.springboot_web.models.User;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){

        User user = new User("Ricardo", "Plata");
        model.addAttribute("title", "Hola Mundo SpringBoot");
        model.addAttribute("user", user);

        
        return "details";
    }

    @GetMapping("/list2")
    public String list(ModelMap model) {
        List<User> users = new ArrayList<>();

        model.addAttribute("users", users);
        return "list";
    }
    
}
