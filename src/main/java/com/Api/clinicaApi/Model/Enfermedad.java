package com.Api.clinicaApi.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Cita")
public class Enfermedad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdEnfermedad;
    private String NombreEnfermedad;
    private String Descripcion;

    public Long getIdEnfermedad() {
        return IdEnfermedad;
    }

    public void setIdEnfermedad(Long idEnfermedad) {
        IdEnfermedad = idEnfermedad;
    }

    public String getNombreEnfermedad() {
        return NombreEnfermedad;
    }

    public void setNombreEnfermedad(String nombreEnfermedad) {
        NombreEnfermedad = nombreEnfermedad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
