package com.Api.clinicaApi.Service;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.CitaInventario;
import com.Api.clinicaApi.Repository.CitaInventarioRepos;
import com.Api.clinicaApi.Repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitaInventarioServ {
    @Autowired
    private CitaInventarioRepos citaInventarioRepos;

    public List<CitaInventario> listarCitas() {
        return citaInventarioRepos.findAll();
    }

    public Optional<CitaInventario> obtenerCitaPorId(Long id) {
        return citaInventarioRepos.findById(id);
    }

    public CitaInventario guardarCitaInv(CitaInventario citaInventario) {
        return citaInventarioRepos.save(citaInventario);
    }

    public void eliminarCitaInv(Long id) {
        citaInventarioRepos.deleteById(id);
    }
}
