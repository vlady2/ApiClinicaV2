package com.Api.clinicaApi.Contrller;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.MetodoPago;
import com.Api.clinicaApi.Service.MetodoPagoServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/metodoPagos")//no trae nada
@CrossOrigin(origins = {"*"})
public class MetodoPagoCont {
    @Autowired
    private MetodoPagoServ metodoPagoServ;
    //arreglar
    @GetMapping
    public List<MetodoPago> listarMetodoPago() {
        return metodoPagoServ.listarMetodoPago();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MetodoPago> obtenerMetodoPagoPorId(@PathVariable Long id) {
        return metodoPagoServ.obtenerMetodoPagoPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
