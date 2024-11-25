package com.Api.clinicaApi.Contrller;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Seguro;
import com.Api.clinicaApi.Service.SeguroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seguros")
@CrossOrigin(origins = {"*"})
public class SeguroController {
    @Autowired
    private SeguroService seguroService;

    @GetMapping
    public List<Seguro> listarSeguros() {
        return seguroService.listarSeguro();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Seguro> obtenerSeguroPorId(@PathVariable Long id) {
        return seguroService.obtenerSeguroPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
