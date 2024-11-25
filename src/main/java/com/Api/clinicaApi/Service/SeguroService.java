package com.Api.clinicaApi.Service;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Seguro;
import com.Api.clinicaApi.Repository.SeguroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeguroService {

    @Autowired
    private SeguroRepository seguroRepository;

    public List<Seguro> listarSeguro() {
        return seguroRepository.findAll();
    }

    public Optional<Seguro> obtenerSeguroPorId(Long id) {
        return seguroRepository.findById(id);
    }

    public Seguro guardarSeguro(Seguro seguro) {
        return seguroRepository.save(seguro);
    }

    public Seguro actualizarSeguro(Long id, Seguro seguroActualizada) {
        return seguroRepository.findById(id).map(seguro -> {
            seguro.setIdSeguro(seguroActualizada.getIdSeguro());
            seguro.setNombre(seguroActualizada.getNombre());
            seguro.setAseguradora(seguroActualizada.getAseguradora());
            return seguroRepository.save(seguro);
        }).orElseThrow(() -> new RuntimeException("seguro no encontrada"));
    }

    public void eliminarSeguro(Long id) {
        seguroRepository.deleteById(id);
    }
}
