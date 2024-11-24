package com.Api.clinicaApi.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Inventario")
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdInventario;
    private String Producto;
    private int Cantidad;
    private LocalDate FechaVencimiento;

    public Long getIdInventario() {
        return IdInventario;
    }

    public void setIdInventario(Long idInventario) {
        IdInventario = idInventario;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String producto) {
        Producto = producto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public LocalDate getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        FechaVencimiento = fechaVencimiento;
    }
}
