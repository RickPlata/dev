package com.big.ids.rest.saludo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SaludoService {

    private String mensaje;

    public SaludoService(@Value("${saludo.mensaje}") String mensaje){
        this.mensaje = mensaje;
    }

    public String obtenerSaludo(){
        return mensaje;
    }
}
