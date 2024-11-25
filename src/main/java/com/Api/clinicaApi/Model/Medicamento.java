package com.Api.clinicaApi.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Medicamento")
public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdMedicamento;
    private String Nombre;
    private String PrincipioActivo;
    private String Dosis;

    public Long getIdMedicamento() {
        return IdMedicamento;
    }

    public void setIdMedicamento(Long idMedicamento) {
        IdMedicamento = idMedicamento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPrincipioActivo() {
        return PrincipioActivo;
    }

    public void setPrincipioActivo(String principioActivo) {
        PrincipioActivo = principioActivo;
    }

    public String getDosis() {
        return Dosis;
    }

    public void setDosis(String dosis) {
        Dosis = dosis;
    }
}
