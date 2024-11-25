package com.Api.clinicaApi.Repository;

import com.Api.clinicaApi.Model.Enfermedad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnfermedadRepository extends JpaRepository<Enfermedad, Long> {
}
