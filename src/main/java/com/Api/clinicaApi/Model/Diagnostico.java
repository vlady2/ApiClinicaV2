package com.Api.clinicaApi.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Diagnostico")
public class Diagnostico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdDiagnostico;
    private int IdCita;
    private int IdEnfermedad;
    private String Descripcion;
    private String Tratamiento;

    public Long getIdDiagnostico() {
        return IdDiagnostico;
    }

    public void setIdDiagnostico(Long idDiagnostico) {
        IdDiagnostico = idDiagnostico;
    }

    public int getIdCita() {
        return IdCita;
    }

    public void setIdCita(int idCita) {
        IdCita = idCita;
    }

    public int getIdEnfermedad() {
        return IdEnfermedad;
    }

    public void setIdEnfermedad(int idEnfermedad) {
        IdEnfermedad = idEnfermedad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getTratamiento() {
        return Tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        Tratamiento = tratamiento;
    }
}
