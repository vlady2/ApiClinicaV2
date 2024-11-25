package com.Api.clinicaApi.Repository;

import com.Api.clinicaApi.Model.Procedimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcedimientoRepository extends JpaRepository<Procedimiento, Long> {
}
