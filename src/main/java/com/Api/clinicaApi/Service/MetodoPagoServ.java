package com.Api.clinicaApi.Service;

import com.Api.clinicaApi.Model.MetodoPago;
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
        return metodoPagoRepos.findAll();
    }

    public Optional<MetodoPago> obtenerMetodoPagoPorId(Long id) {
        return metodoPagoRepos.findById(id);
    }

    public MetodoPago guardarMetodoPago(MetodoPago metodoPago) {
        return metodoPagoRepos.save(metodoPago);
    }

    public MetodoPago actualizarMetodoPago(Long id, MetodoPago metodoPagoActualizada) {
        return metodoPagoRepos.findById(id).map(metodoPago -> {
            metodoPago.setIdMetodoPago(metodoPagoActualizada.getIdMetodoPago());
            metodoPago.setDescripcion(metodoPagoActualizada.getDescripcion());
            return metodoPagoRepos.save(metodoPago);
        }).orElseThrow(() -> new RuntimeException("MetodoPago no encontrada"));
    }

    public void eliminarMetodoPago(Long id) {
        metodoPagoRepos.deleteById(id);
    }
}
