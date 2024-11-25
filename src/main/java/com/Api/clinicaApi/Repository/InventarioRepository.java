package com.Api.clinicaApi.Repository;

import com.Api.clinicaApi.Model.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository extends JpaRepository<Inventario, Long> {
}
