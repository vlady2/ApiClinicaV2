package com.Api.clinicaApi.Contrller;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Diagnostico;
import com.Api.clinicaApi.Service.DiagnosticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diagnosticos")
@CrossOrigin(origins = {"*"})
public class DiagnosticoController {
    @Autowired
    private DiagnosticoService diagnosticoService;

    @GetMapping
    public List<Diagnostico> listarDiagnostico() {
        return diagnosticoService.listarDiagnostico();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Diagnostico> obtenerDiagnosticoPorId(@PathVariable Long id) {
        return diagnosticoService.obtenerDiagnosticoPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Diagnostico crearDiagnostico(@RequestBody Diagnostico diagnostico) {
        return diagnosticoService.guardarDiagnostico(diagnostico);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Diagnostico> actualizarDiagnostico(@PathVariable Long id, @RequestBody Diagnostico diagnostico) {
        try {
            return ResponseEntity.ok(diagnosticoService.actualizarDiagnostico(id, diagnostico));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarDiagnostico(@PathVariable Long id) {
        diagnosticoService.eliminarDiagnostico(id);
        return ResponseEntity.noContent().build();
    }
}
