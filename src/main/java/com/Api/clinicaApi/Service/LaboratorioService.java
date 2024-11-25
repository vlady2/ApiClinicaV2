package com.Api.clinicaApi.Service;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Laboratorio;
import com.Api.clinicaApi.Repository.CitaRepository;
import com.Api.clinicaApi.Repository.LaboratorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaboratorioService {
    @Autowired
    private LaboratorioRepository laboratorioRepository;

    public List<Laboratorio> listarLaboratorio() {
        return laboratorioRepository.findAll();
    }

    public Optional<Laboratorio> obtenerLaboratorioPorId(Long id) {
        return laboratorioRepository.findById(id);
    }

    public Laboratorio guardarLaboratorio(Laboratorio laboratorio) {
        return laboratorioRepository.save(laboratorio);
    }

    public Laboratorio actualizarLaboratorio(Long id, Laboratorio laboratorioActualizada) {
        return laboratorioRepository.findById(id).map(laboratorio -> {
            laboratorio.setIdLaboratorio(laboratorioActualizada.getIdLaboratorio());
            laboratorio.setUbicacion(laboratorioActualizada.getUbicacion());
            laboratorio.setTelefono(laboratorioActualizada.getTelefono());
            laboratorio.setEspecialidad(laboratorioActualizada.getEspecialidad());
            return laboratorioRepository.save(laboratorio);
        }).orElseThrow(() -> new RuntimeException("Laboratorio no encontrada"));
    }

    public void eliminarLaboratorio(Long id) {
        laboratorioRepository.deleteById(id);
    }
}
