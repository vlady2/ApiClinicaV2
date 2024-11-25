package com.Api.clinicaApi.Contrller;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Paciente;
import com.Api.clinicaApi.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public List<Paciente> listarPaciente() {
        return pacienteService.listarPaciente();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> obtenerCitaPorId(@PathVariable Long id) {
        return pacienteService.obtenerPacientePorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Paciente crearPaciente(@RequestBody Paciente paciente) {
        return pacienteService.guardarPaciente(paciente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Paciente> actualizarPaciente(@PathVariable Long id, @RequestBody Paciente paciente) {
        try {
            return ResponseEntity.ok(pacienteService.actualizarPaciente(id, paciente));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPaciente(@PathVariable Long id) {
        pacienteService.eliminarPaciente(id);
        return ResponseEntity.noContent().build();
    }
}
