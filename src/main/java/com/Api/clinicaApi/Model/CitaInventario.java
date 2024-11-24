package com.Api.clinicaApi.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "CitaInventario")
public class CitaInventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCitaInventario;
    private Long IdCita;
    private Long IdInventario;
    private int Cantidad;

    public Long getIdCitaInventario() {
        return idCitaInventario;
    }

    public void setIdCitaInventario(Long idCitaInventario) {
        this.idCitaInventario = idCitaInventario;
    }

    public Long getIdCita() {
        return IdCita;
    }

    public void setIdCita(Long idCita) {
        IdCita = idCita;
    }

    public Long getIdInventario() {
        return IdInventario;
    }

    public void setIdInventario(Long idInventario) {
        IdInventario = idInventario;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
}
