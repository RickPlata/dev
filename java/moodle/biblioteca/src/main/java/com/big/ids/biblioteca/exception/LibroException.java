package com.big.ids.biblioteca.exception;

public class LibroException extends RuntimeException{

    public LibroException(Long id){
        super("No se encontro el libro con el ID: " + id);
    }
}
