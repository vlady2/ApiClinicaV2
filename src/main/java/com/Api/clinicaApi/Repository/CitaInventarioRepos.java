package com.Api.clinicaApi.Repository;

import com.Api.clinicaApi.Model.CitaInventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitaInventarioRepos extends JpaRepository<CitaInventario, Long> {
}