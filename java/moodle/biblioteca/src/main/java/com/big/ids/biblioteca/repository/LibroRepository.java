package com.big.ids.biblioteca.repository;

import com.big.ids.biblioteca.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}
