package com.Api.clinicaApi.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Laboratorio")
public class Laboratorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdLaboratorio;
    private String Ubicacion;
    private String Telefono;
    private String Especialidad;

    public Long getIdLaboratorio() {
        return IdLaboratorio;
    }

    public void setIdLaboratorio(Long idLaboratorio) {
        IdLaboratorio = idLaboratorio;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }
}
