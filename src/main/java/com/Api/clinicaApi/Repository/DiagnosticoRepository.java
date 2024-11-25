package com.Api.clinicaApi.Repository;

import com.Api.clinicaApi.Model.Diagnostico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnosticoRepository extends JpaRepository<Diagnostico, Long> {
}
