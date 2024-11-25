package com.Api.clinicaApi.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Procedimiento")
public class Procedimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdProcedimiento;
    private String Nombre;
    private String Descripcion;

    public Long getIdProcedimiento() {
        return IdProcedimiento;
    }

    public void setIdProcedimiento(Long idProcedimiento) {
        IdProcedimiento = idProcedimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
