package com.Api.clinicaApi.Contrller;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Medico;
import com.Api.clinicaApi.Service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {
    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public List<Medico> listarMedico() {
        return medicoService.listarMedico();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medico> obtenerMedicoPorId(@PathVariable Long id) {
        return medicoService.obtenerMedicoPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Medico crearMedico(@RequestBody Medico medico) {
        return medicoService.guardarMedico(medico);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Medico> actualizarMedico(@PathVariable Long id, @RequestBody Medico medico) {
        try {
            return ResponseEntity.ok(medicoService.actualizarMedico(id, medico));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMedico(@PathVariable Long id) {
        medicoService.eliminarMedico(id);
        return ResponseEntity.noContent().build();
    }
}
