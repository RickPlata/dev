package com.big.ids.biblioteca.service;

import com.big.ids.biblioteca.entity.Libro;
import com.big.ids.biblioteca.repository.LibroRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class LibroServiceTest {

    @Mock
    private LibroRepository repository;

    @InjectMocks
    private LibroService service;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void obtenerPorID_test (){

        Libro libro = new Libro(1L,"Libro 1", "Autor 1");
        when(repository.findById(libro.getId())).thenReturn(Optional.of(libro));

        Optional<Libro> result = service.ObtenerPorID(libro.getId());


        assertEquals(1L,result.get().getId());
        assertEquals("Libro 1",result.get().getTitulo());
        assertEquals("Autor 1",result.get().getAutor());
    }

}
