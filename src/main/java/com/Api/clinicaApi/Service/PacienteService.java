package com.Api.clinicaApi.Service;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Paciente;
import com.Api.clinicaApi.Repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PacienteService {
    @Autowired
    private PacienteRepository repository;

    public List<Paciente> listarPaciente() {
        return repository.findAll();
    }

    public Optional<Paciente> obtenerPacientePorId(Long id) {
        return repository.findById(id);
    }

    public Paciente guardarPaciente(Paciente paciente) {
        return repository.save(paciente);
    }

    public Paciente actualizarPaciente(Long id, Paciente pacienteActualizada) {
        return repository.findById(id).map(paciente -> {
            paciente.setIdPaciente(pacienteActualizada.getIdPaciente());
            paciente.setNombres(pacienteActualizada.getNombres());
            paciente.setApellidos(pacienteActualizada.getApellidos());
            paciente.setFechaNacimiento(pacienteActualizada.getFechaNacimiento());
            paciente.setSexo(pacienteActualizada.getSexo());
            paciente.setDUI(pacienteActualizada.getDUI());
            paciente.setDireccion(pacienteActualizada.getDireccion());
            paciente.setTelefono(pacienteActualizada.getTelefono());
            paciente.setIdSeguro(pacienteActualizada.getIdSeguro());
            paciente.setHistorialClinico(pacienteActualizada.getHistorialClinico());
            return repository.save(paciente);
        }).orElseThrow(() -> new RuntimeException("Paciente no encontrada"));
    }

    public void eliminarPaciente(Long id) {
        repository.deleteById(id);
    }
}
