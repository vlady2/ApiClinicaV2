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

    public List<CitaInventario> listarCitasInv() {
        return citaInventarioRepos.findAll();
    }

    public Optional<CitaInventario> obtenerCitaInvPorId(Long id) {
        return citaInventarioRepos.findById(id);
    }

    public CitaInventario guardarCitaInv(CitaInventario citaInventario) {
        return citaInventarioRepos.save(citaInventario);
    }

    public CitaInventario actualizarCitaInv(Long id, CitaInventario citaActualizada) {
        return citaInventarioRepos.findById(id).map(citaInventario -> {
            citaInventario.setIdCitaInventario(citaActualizada.getIdCitaInventario());
            citaInventario.setIdCita(citaActualizada.getIdCita());
            citaInventario.setIdInventario(citaActualizada.getIdInventario());
            citaInventario.setCantidad(citaActualizada.getCantidad());
            return citaInventarioRepos.save(citaInventario);
        }).orElseThrow(() -> new RuntimeException("Cita no encontrada"));
    }

    public void eliminarCitaInv(Long id) {
        citaInventarioRepos.deleteById(id);
    }
}
