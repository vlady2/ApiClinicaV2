package com.Api.clinicaApi.Service;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Enfermedad;
import com.Api.clinicaApi.Repository.EnfermedadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnfermedadService {
    @Autowired
    private EnfermedadRepository enfermedadRepository;

    public List<Enfermedad> listarEnfermedad() {
        return enfermedadRepository.findAll();
    }

    public Optional<Enfermedad> obtenerEnfermedadPorId(Long id) {
        return enfermedadRepository.findById(id);
    }

    public Enfermedad guardarEnfermedad(Enfermedad enfermedad) {
        return enfermedadRepository.save(enfermedad);
    }

    public Enfermedad actualizarEnfermedad(Long id, Enfermedad enfermedadActualizada) {
        return enfermedadRepository.findById(id).map(enfermedad -> {
            enfermedad.setIdEnfermedad(enfermedadActualizada.getIdEnfermedad());
            enfermedad.setNombreEnfermedad(enfermedadActualizada.getNombreEnfermedad());
            enfermedad.setDescripcion(enfermedadActualizada.getDescripcion());
            return enfermedadRepository.save(enfermedad);
        }).orElseThrow(() -> new RuntimeException("Enfermedad no encontrada"));
    }

    public void eliminarEnfermedad(Long id) {
        enfermedadRepository.deleteById(id);
    }

}
