package com.Api.clinicaApi.Repository;

import com.Api.clinicaApi.Model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
