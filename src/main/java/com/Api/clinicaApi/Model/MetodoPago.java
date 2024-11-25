package com.Api.clinicaApi.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "MetodoPago")
public class MetodoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdMetodoPago;
    private String Descripcion;

    public Long getIdMetodoPago() {
        return IdMetodoPago;
    }

    public void setIdMetodoPago(Long idMetodoPago) {
        IdMetodoPago = idMetodoPago;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
