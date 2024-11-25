package com.Api.clinicaApi.Service;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Especialidad;
import com.Api.clinicaApi.Repository.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EspecialidadService {

    @Autowired
    private EspecialidadRepository repository;

    public List<Especialidad> listarEspecialidad() {
        return repository.findAll();
    }

    public Optional<Especialidad> obtenerEspecialidadPorId(Long id) {
        return repository.findById(id);
    }

    public Especialidad guardarEspecialidad(Especialidad Especialidad) {
        return repository.save(Especialidad);
    }

    public Especialidad actualizarEspecialidad(Long id, Especialidad especialidadActualizada) {
        return repository.findById(id).map(especialidad -> {
            especialidad.setIdEspecialidad(especialidadActualizada.getIdEspecialidad());
            especialidad.setNombre(especialidadActualizada.getNombre());
            return repository.save(especialidad);
        }).orElseThrow(() -> new RuntimeException("Cita no encontrada"));
    }

    public void eliminarEspecialidad(Long id) {
        repository.deleteById(id);
    }
}
