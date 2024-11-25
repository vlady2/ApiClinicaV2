package com.Api.clinicaApi.Repository;

import com.Api.clinicaApi.Model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
