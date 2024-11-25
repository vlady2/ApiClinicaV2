package com.Api.clinicaApi.Contrller;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Procedimiento;
import com.Api.clinicaApi.Service.ProcedimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/procedimientos")
public class ProcedimientoController {
    @Autowired
    private ProcedimientoService procedimientoService;

    @GetMapping
    public List<Procedimiento> listarProcedimiento() {
        return procedimientoService.listarProcedimiento();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Procedimiento> obtenerProcedimientoPorId(@PathVariable Long id) {
        return procedimientoService.obtenerProcedimientoPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Procedimiento crearProcedimiento(@RequestBody Procedimiento procedimiento) {
        return procedimientoService.guardarProcedimiento(procedimiento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Procedimiento> actualizarProcedimiento(@PathVariable Long id, @RequestBody Procedimiento procedimiento) {
        try {
            return ResponseEntity.ok(procedimientoService.actualizarProcedimiento(id, procedimiento));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProcedimiento(@PathVariable Long id) {
        procedimientoService.eliminarProcedimiento(id);
        return ResponseEntity.noContent().build();
    }
}
