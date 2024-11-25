package com.Api.clinicaApi.Repository;

import com.Api.clinicaApi.Model.Examen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamenRepository extends JpaRepository<Examen, Long> {
}
