package com.Api.clinicaApi.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Seguro")
public class Seguro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdSeguro;
    private String Nombre;
    private String Aseguradora;

    public Long getIdSeguro() {
        return IdSeguro;
    }

    public void setIdSeguro(Long idSeguro) {
        IdSeguro = idSeguro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getAseguradora() {
        return Aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        Aseguradora = aseguradora;
    }
}
