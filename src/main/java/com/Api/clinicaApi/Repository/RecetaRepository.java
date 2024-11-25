package com.Api.clinicaApi.Repository;

import com.Api.clinicaApi.Model.Receta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecetaRepository extends JpaRepository<Receta, Long> {
}
