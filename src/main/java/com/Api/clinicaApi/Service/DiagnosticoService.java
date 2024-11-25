package com.Api.clinicaApi.Service;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Diagnostico;
import com.Api.clinicaApi.Repository.DiagnosticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiagnosticoService {
    @Autowired
    private DiagnosticoRepository diagnosticoRepository;

    public List<Diagnostico> listarDiagnostico() {
        return diagnosticoRepository.findAll();
    }

    public Optional<Diagnostico> obtenerDiagnosticoPorId(Long id) {
        return diagnosticoRepository.findById(id);
    }

    public Diagnostico guardarDiagnostico(Diagnostico diagnostico) {
        return diagnosticoRepository.save(diagnostico);
    }

    public void eliminarDiagnostico(Long id) {
        diagnosticoRepository.deleteById(id);
    }

    public Diagnostico actualizarDiagnostico(Long id, Diagnostico diagnosticoActualizada) {
        return diagnosticoRepository.findById(id).map(diagnostico -> {
            diagnostico.setIdDiagnostico(diagnosticoActualizada.getIdDiagnostico());
            diagnostico.setIdCita(diagnosticoActualizada.getIdCita());
            diagnostico.setIdEnfermedad(diagnosticoActualizada.getIdEnfermedad());
            diagnostico.setDescripcion(diagnosticoActualizada.getDescripcion());
            diagnostico.setTratamiento(diagnosticoActualizada.getTratamiento());
            return diagnosticoRepository.save(diagnostico);
        }).orElseThrow(() -> new RuntimeException("diagnostico no encontrada"));
    }
}
