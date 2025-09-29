package com.big.curso.springboot.webapp.springboot_web.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.big.curso.springboot.webapp.springboot_web.models.User;

import java.util.HashMap;
import java.util.Map;

@RestController //tipo de controlador
@RequestMapping("/api") //ruta por defecto para el controlador
public class UserRestController {

    @RequestMapping(path="/details2", method = RequestMethod.GET)// otra forma de definir un metodo rest
    public Map<String, Object> details(){

        User user = new User("Ricardo", "Plata");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Mundo SpringBoot");
        body.put("user", user);

        
        return body;
    }
}
