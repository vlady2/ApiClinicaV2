package com.Api.clinicaApi.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdEspecialidad;
    private String Nombre;

    public Long getIdEspecialidad() {
        return IdEspecialidad;
    }
    public void setIdEspecialidad(Long IdEspecialidad) {
        this.IdEspecialidad = IdEspecialidad;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
