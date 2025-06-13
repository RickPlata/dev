package com.big.cursoSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

/**
 * Endpoint para detectar palindromos
 * @param cadena es la palabra a verificar
 * @return retorna un mensaje confirmando si la palabra es o no un palindromo
 */

public class PalindromoController {
    @GetMapping("/pal/{cadena}")

    public String palindoromo(@PathVariable String cadena) {
        if (isPalindromo(cadena)){
            return "La palabra " + cadena + " es un palindromo";
        }else{
            return "La palabra " + cadena + " NO es un palindromo";
        }
    }

    /**
     * Metodo que verifica el palindromo
     * @param cadena varbiable que contiene la palabra a verificar
     * @return true o false dependiendo de si es o no un palindromo
     */

    private boolean isPalindromo(String cadena) {
         int lenght = cadena.length();

        for (int i = 0; i < lenght/2; i ++){
            if (cadena.charAt(i) != cadena.charAt(lenght-i-1)) {
                return false;
            }
        }
        return true;
    }
}
