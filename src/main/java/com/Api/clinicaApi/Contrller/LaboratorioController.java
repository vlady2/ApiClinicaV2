package com.Api.clinicaApi.Contrller;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Laboratorio;
import com.Api.clinicaApi.Service.LaboratorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/laboratorios")//
@CrossOrigin(origins = {"*"})
public class LaboratorioController {
    @Autowired
    private LaboratorioService laboratorioService;
    //arreglar
    @GetMapping
    public List<Laboratorio> listarLaboratorio() {
        return laboratorioService.listarLaboratorio();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Laboratorio> obtenerLaboratorioPorId(@PathVariable Long id) {
        return laboratorioService.obtenerLaboratorioPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
