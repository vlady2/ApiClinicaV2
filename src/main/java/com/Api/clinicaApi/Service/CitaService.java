package com.Api.clinicaApi.Service;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitaService {

    @Autowired
    private CitaRepository citaRepository;

    public List<Cita> listarCitas() {
        return citaRepository.findAll();
    }

    public Optional<Cita> obtenerCitaPorId(Long id) {
        return citaRepository.findById(id);
    }

    public Cita guardarCita(Cita cita) {
        return citaRepository.save(cita);
    }

    public Cita actualizarCita(Long id, Cita citaActualizada) {
        return citaRepository.findById(id).map(cita -> {
            cita.setIdPaciente(citaActualizada.getIdPaciente());
            cita.setIdMedico(citaActualizada.getIdMedico());
            cita.setIdSeguro(citaActualizada.getIdSeguro());
            cita.setIdMetodoPago(citaActualizada.getIdMetodoPago());
            cita.setFechaCita(citaActualizada.getFechaCita());
            cita.setHoraCita(citaActualizada.getHoraCita());
            cita.setMotivoConsulta(citaActualizada.getMotivoConsulta());
            cita.setIdProcedimiento(citaActualizada.getIdProcedimiento());
            cita.setFechaFacturacion(citaActualizada.getFechaFacturacion());
            cita.setTotalFactura(citaActualizada.getTotalFactura());
            return citaRepository.save(cita);
        }).orElseThrow(() -> new RuntimeException("Cita no encontrada"));
    }

    public void eliminarCita(Long id) {
        citaRepository.deleteById(id);
    }
}
