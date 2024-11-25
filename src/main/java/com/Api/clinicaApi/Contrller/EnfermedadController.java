package com.Api.clinicaApi.Contrller;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Enfermedad;
import com.Api.clinicaApi.Service.EnfermedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enfermedades")//
@CrossOrigin(origins = {"*"})
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
