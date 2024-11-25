package com.Api.clinicaApi.Contrller;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Receta;
import com.Api.clinicaApi.Service.RecetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recetas")
public class RecetaController {
    @Autowired
    RecetaService recetaService;

    @GetMapping
    public List<Receta> listarReceta() {
        return recetaService.listarReceta();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Receta> obtenerRecetaPorId(@PathVariable Long id) {
        return recetaService.obtenerRecetaPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Receta crearReceta(@RequestBody Receta receta) {
        return recetaService.guardarReceta(receta);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Receta> actualizarReceta(@PathVariable Long id, @RequestBody Receta receta) {
        try {
            return ResponseEntity.ok(recetaService.actualizarReceta(id, receta));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarReceta(@PathVariable Long id) {
        recetaService.eliminarReceta(id);
        return ResponseEntity.noContent().build();
    }
}
