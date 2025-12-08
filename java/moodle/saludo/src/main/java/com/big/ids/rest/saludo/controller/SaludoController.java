package com.big.ids.rest.saludo.controller;

import com.big.ids.rest.saludo.service.SaludoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SaludoController {

    private SaludoService saludoService;

    public SaludoController(SaludoService saludoService){
        this.saludoService = saludoService;
    }

    @GetMapping("/saludo")
    public String obtenerSaludo(){
        return saludoService.obtenerSaludo();
    }

}
