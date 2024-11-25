package com.Api.clinicaApi.Service;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Receta;
import com.Api.clinicaApi.Repository.RecetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecetaService {

    @Autowired
    private RecetaRepository recetaRepository;

    public List<Receta> listarReceta() {
        return recetaRepository.findAll();
    }

    public Optional<Receta> obtenerRecetaPorId(Long id) {
        return recetaRepository.findById(id);
    }

    public Receta guardarReceta(Receta receta) {
        return recetaRepository.save(receta);
    }

    public Receta actualizarReceta(Long id, Receta recetaActualizada) {
        return recetaRepository.findById(id).map(receta -> {
            receta.setIdReceta(recetaActualizada.getIdReceta());
            receta.setIdCita(recetaActualizada.getIdCita());
            receta.setIdMedicamento(recetaActualizada.getIdMedicamento());
            receta.setCantidad(recetaActualizada.getCantidad());
            receta.setIndicaciones(recetaActualizada.getIndicaciones());
            return recetaRepository.save(receta);
        }).orElseThrow(() -> new RuntimeException("Receta no encontrada"));
    }

    public void eliminarReceta(Long id) {
        recetaRepository.deleteById(id);
    }
}
