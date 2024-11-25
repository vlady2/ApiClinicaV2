package com.Api.clinicaApi.Contrller;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Enfermedad;
import com.Api.clinicaApi.Service.EnfermedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/enfermedades")//
public class EnfermedadController {
    @Autowired
    private EnfermedadService enfermedadService;
    //arreglar
    @GetMapping
    public List<Enfermedad> listarEnfermedad() {
        return enfermedadService.listarEnfermedad();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Enfermedad> obtenerEnfermedadPorId(@PathVariable Long id) {
        return enfermedadService.obtenerEnfermedadPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
