package com.Api.clinicaApi.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Cita")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdCita;
    @Column(nullable = false)
    private Long IdPaciente;
    @Column(nullable = false)
    private Long IdMedico;
    @Column(nullable = false)
    private Long IdSeguro;
    @Column(nullable = false)
    private Long IdMetodoPago;
    @Column(nullable = false)
    private LocalDate FechaCita;
    @Column(nullable = false)
    private String HoraCita;
    @Column(nullable = false)
    private String MotivoConsulta;
    @Column(nullable = false)
    private Long IdProcedimiento;
    @Column(nullable = false)
    private LocalDate FechaFacturacion;;
    @Column(nullable = false)
    private double totalFactura;

    public Long getIdCita() {
        return IdCita;
    }

    public void setIdCita(Long idCita) {
        this.IdCita = idCita;
    }

    public Long getIdPaciente() {
        return IdPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        IdPaciente = idPaciente;
    }

    public Long getIdMedico() {
        return IdMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.IdMedico = idMedico;
    }

    public Long getIdSeguro() {
        return IdSeguro;
    }

    public void setIdSeguro(Long idSeguro) {
        this.IdSeguro = idSeguro;
    }

    public Long getIdMetodoPago() {
        return IdMetodoPago;
    }

    public void setIdMetodoPago(Long idMetodoPago) {
        this.IdMetodoPago = idMetodoPago;
    }

    public LocalDate getFechaCita() {
        return FechaCita;
    }

    public void setFechaCita(LocalDate fechaCita) {
        this.FechaCita = fechaCita;
    }

    public String getHoraCita() {
        return HoraCita;
    }

    public void setHoraCita(String horaCita) {
        this.HoraCita = horaCita;
    }

    public String getMotivoConsulta() {
        return MotivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.MotivoConsulta = motivoConsulta;
    }

    public Long getIdProcedimiento() {
        return IdProcedimiento;
    }

    public void setIdProcedimiento(Long idProcedimiento) {
        this.IdProcedimiento = idProcedimiento;
    }

    public LocalDate getFechaFacturacion() {
        return FechaFacturacion;
    }

    public void setFechaFacturacion(LocalDate fechaFacturacion) {
        this.FechaFacturacion = fechaFacturacion;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
    }
}
