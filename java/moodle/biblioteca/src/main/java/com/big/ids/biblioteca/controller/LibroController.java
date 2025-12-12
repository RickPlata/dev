package com.big.ids.biblioteca.controller;

import com.big.ids.biblioteca.entity.Libro;
import com.big.ids.biblioteca.service.LibroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/libros")
public class LibroController {

    private final LibroService service;

    public LibroController(LibroService service){
        this.service = service;
    }

    @GetMapping
    public List<Libro> getLibros(){
        return service.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Libro> getLibroById(@PathVariable Long id){
        return service.ObtenerPorID(id);
    }

    @PostMapping
    public Libro newLibro(@RequestBody Libro libro){
        return service.guardarLibro(libro);
    }

    @DeleteMapping("/{id}")
    public void delLibro(@PathVariable Long id){
        service.eliminarLibro(id);
    }

}
