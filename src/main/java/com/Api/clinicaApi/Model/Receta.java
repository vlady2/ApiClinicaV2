package com.Api.clinicaApi.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Receta")
public class Receta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdReceta;
    private int IdCita;
    private int IdMedicamento;
    private int Cantidad;
    private String Indicaciones;

    public Long getIdReceta() {
        return IdReceta;
    }

    public void setIdReceta(Long idReceta) {
        IdReceta = idReceta;
    }

    public int getIdCita() {
        return IdCita;
    }

    public void setIdCita(int idCita) {
        IdCita = idCita;
    }

    public int getIdMedicamento() {
        return IdMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        IdMedicamento = idMedicamento;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public String getIndicaciones() {
        return Indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        Indicaciones = indicaciones;
    }
}
