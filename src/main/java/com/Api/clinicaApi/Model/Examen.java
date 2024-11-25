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

    public Long getIdExamen() {
        return IdExamen;
    }

    public void setIdExamen(Long idExamen) {
        IdExamen = idExamen;
    }

    public int getIdCita() {
        return IdCita;
    }

    public void setIdCita(int idCita) {
        IdCita = idCita;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getResultado() {
        return Resultado;
    }

    public void setResultado(String resultado) {
        Resultado = resultado;
    }

    public int getIdLaboratorio() {
        return IdLaboratorio;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        IdLaboratorio = idLaboratorio;
    }

    public LocalDate getFechaRealizacion() {
        return FechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        FechaRealizacion = fechaRealizacion;
    }

    public LocalDate getFechaResultado() {
        return FechaResultado;
    }

    public void setFechaResultado(LocalDate fechaResultado) {
        FechaResultado = fechaResultado;
    }
}
