package com.big.ag.botsapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reportes_admin")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReporteAdmin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String nombre;

    @Column(nullable = false, length = 255)
    private String lab;

    @Column(nullable = true, length = 255)
    private String materia;

    @Column(nullable = false, length = 255)
    private String incidencia;

    @Column(nullable = false)
    private java.time.LocalTime hora;

    @Column(nullable = false)
    private java.time.LocalDate fecha;

    @Column(nullable = false)
    private Byte his;
}
