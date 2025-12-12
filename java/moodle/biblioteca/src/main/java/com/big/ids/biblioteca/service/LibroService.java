package com.big.ids.biblioteca.service;

import com.big.ids.biblioteca.entity.Libro;
import com.big.ids.biblioteca.repository.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    private final LibroRepository repository;

    public LibroService(LibroRepository repository){
        this.repository = repository;
    }

    public List<Libro> obtenerTodos(){
        return repository.findAll();
    }

    public Optional<Libro> ObtenerPorID(Long id){
        return repository.findById(id);
    }

    public Libro guardarLibro(Libro libro){
        return repository.save(libro);
    }

    public void eliminarLibro(Long id){
        repository.deleteById(id);
    }
}
