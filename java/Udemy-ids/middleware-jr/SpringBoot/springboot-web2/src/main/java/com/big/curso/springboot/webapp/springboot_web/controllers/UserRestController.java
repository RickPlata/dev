package com.big.curso.springboot.webapp.springboot_web.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.big.curso.springboot.webapp.springboot_web.models.User;
import com.big.curso.springboot.webapp.springboot_web.models.dto.UserDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController //tipo de controlador
@RequestMapping("/api") //ruta por defecto para el controlador
public class UserRestController {

    @RequestMapping(path="/details2", method = RequestMethod.GET)// otra forma de definir un metodo rest
    public UserDto details(){

        UserDto userDto = new UserDto();
        User user = new User("Ricardo", "Plata");
        // userDto.setUser(user);// este es el setter de la clase UserDto
        // userDto.setTitle("Hola Mundo SpringBoot");

        userDto.setName(user.getName());
        userDto.setLastName(user.getLastName());
        userDto.setTitle("Hola mundo SpringBoot");

        return userDto;

        //UserDto se es el que utiliza para transaccionar la clase User no se expone
        
        
    }

    @GetMapping("/list")
    public List<User> list(){

        User user = new User("Ricardo", "Plata");
        User user2 = new User("Juan", "Perez");
        User user3 = new User("Jhon", "Doe");

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);

        return users;
    }


    @RequestMapping(path="/details-map", method = RequestMethod.GET)// otra forma de definir un metodo rest
    public Map<String, Object> detailsMap(){

        User user = new User("Ricardo", "Plata");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Mundo SpringBoot");
        body.put("user", user);

        
        return body;
    }
}
