package com.Api.clinicaApi.Repository;

import com.Api.clinicaApi.Model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {
}
