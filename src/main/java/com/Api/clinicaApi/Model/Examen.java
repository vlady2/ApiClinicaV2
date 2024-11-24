package com.Api.clinicaApi.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Examen")
public class Examen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdExamen;
    private int IdCita;
    private String Tipo;
    private String Resultado;
    private int IdLaboratorio;
    private LocalDate FechaRealizacion;
    private LocalDate FechaResultado;

}
