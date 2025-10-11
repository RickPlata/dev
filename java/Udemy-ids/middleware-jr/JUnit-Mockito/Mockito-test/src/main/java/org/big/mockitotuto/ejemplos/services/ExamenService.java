package org.big.mockitotuto.ejemplos.services;

import org.big.mockitotuto.ejemplos.models.Examen;

public interface ExamenService {
    Examen findExamenPorNombre(String nombre);

}
