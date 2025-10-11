package org.big.mockitotuto.ejemplos.repositories;

import org.big.mockitotuto.ejemplos.models.Examen;

import java.util.List;

public interface ExamenRepository {
    List<Examen> findALl();
}
