package com.Api.clinicaApi.Service;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.MetodoPago;
import com.Api.clinicaApi.Repository.CitaRepository;
import com.Api.clinicaApi.Repository.MetodoPagoRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MetodoPagoServ {

    @Autowired
    private MetodoPagoRepos metodoPagoRepos;

    public List<MetodoPago> listarMetodoPago() {
        return MetodoPagoRepos.findAll();
    }

    public Optional<MetodoPago> obtenerMetodoPagoPorId(Long id) {
        return MetodoPagoRepos.findById(id);
    }

    public MetodoPago guardarMetodoPago(MetodoPago metodoPago) {
        return MetodoPagoRepos.save(metodoPago);
    }

    public MetodoPago actualizarMetodoPago(Long id, MetodoPago metodoPagoActualizada) {
        return MetodoPagoRepos.findById(id).map(metodoPago -> {
            metodoPago.setIdMetodoPago(metodoPagoActualizada.getIdMetodoPago());
            metodoPago.setDescripcion(metodoPagoActualizada.getDescripcion());
            return MetodoPagoRepos.save(metodoPago);
        }).orElseThrow(() -> new RuntimeException("MetodoPago no encontrada"));
    }

    public void eliminarMetodoPago(Long id) {
        MetodoPagoRepos.deleteById(id);
    }
}
