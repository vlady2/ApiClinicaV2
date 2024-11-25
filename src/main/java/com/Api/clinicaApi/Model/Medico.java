package com.Api.clinicaApi.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdMedico;
    private String Nombre;
    private String Apellidos;
    private String DUI;
    private int IdEspeciualidad;
    private String HoraAtencion;
    private String Estado;

    public Long getIdMedico() {
        return IdMedico;
    }

    public void setIdMedico(Long idMedico) {
        IdMedico = idMedico;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public int getIdEspeciualidad() {
        return IdEspeciualidad;
    }

    public void setIdEspeciualidad(int idEspeciualidad) {
        IdEspeciualidad = idEspeciualidad;
    }

    public String getHoraAtencion() {
        return HoraAtencion;
    }

    public void setHoraAtencion(String horaAtencion) {
        HoraAtencion = horaAtencion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
