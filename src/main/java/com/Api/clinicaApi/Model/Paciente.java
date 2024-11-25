package com.Api.clinicaApi.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdPaciente;
    private String Nombres;
    private String Apellidos;
    private LocalDate FechaNacimiento;
    private String Sexo;
    private String DUI;
    private String Direccion;
    private String Telefono;
    private int IdSeguro;
    private String HistorialClinico;

    public Long getIdPaciente() {
        return IdPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        IdPaciente = idPaciente;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public int getIdSeguro() {
        return IdSeguro;
    }

    public void setIdSeguro(int idSeguro) {
        IdSeguro = idSeguro;
    }

    public String getHistorialClinico() {
        return HistorialClinico;
    }

    public void setHistorialClinico(String historialClinico) {
        HistorialClinico = historialClinico;
    }
}
