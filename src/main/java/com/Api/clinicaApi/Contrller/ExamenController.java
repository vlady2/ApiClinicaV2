package com.Api.clinicaApi.Contrller;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Examen;
import com.Api.clinicaApi.Service.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/examenes")
public class ExamenController {
    @Autowired
    private ExamenService examenService;

    @GetMapping
    public List<Examen> listarExamen() {
        return examenService.listarExamen();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Examen> obtenerExamenPorId(@PathVariable Long id) {
        return examenService.obtenerExamenPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Examen crearExamen(@RequestBody Examen examen) {
        return examenService.guardarExamen(examen);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Examen> actualizarExamen(@PathVariable Long id, @RequestBody Examen examen) {
        try {
            return ResponseEntity.ok(examenService.actualizarExamen(id, examen));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarExamen(@PathVariable Long id) {
        examenService.eliminarExamen(id);
        return ResponseEntity.noContent().build();
    }
}
