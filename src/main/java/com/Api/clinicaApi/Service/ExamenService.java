package com.Api.clinicaApi.Service;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Examen;
import com.Api.clinicaApi.Repository.ExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExamenService {

    @Autowired
    private ExamenRepository examenRepository;

    public List<Examen> listarExamen() {
        return examenRepository.findAll();
    }

    public Optional<Examen> obtenerExamenPorId(Long id) {
        return examenRepository.findById(id);
    }

    public Examen guardarExamen(Examen examen) {
        return examenRepository.save(examen);
    }

    public Examen actualizarExamen(Long id, Examen examenActualizada) {
        return examenRepository.findById(id).map(examen -> {
            examen.setIdExamen(examenActualizada.getIdExamen());
            examen.setIdCita(examenActualizada.getIdCita());
            examen.setTipo(examenActualizada.getTipo());
            examen.setResultado(examenActualizada.getResultado());
            examen.setIdLaboratorio(examenActualizada.getIdLaboratorio());
            examen.setFechaRealizacion(examenActualizada.getFechaRealizacion());
            examen.setFechaResultado(examenActualizada.getFechaResultado());
            return examenRepository.save(examen);
        }).orElseThrow(() -> new RuntimeException("Examen no encontrada"));
    }

    public void eliminarExamen(Long id) {
        examenRepository.deleteById(id);
    }
}
