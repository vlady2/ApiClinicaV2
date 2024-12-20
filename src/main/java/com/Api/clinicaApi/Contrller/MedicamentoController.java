package com.Api.clinicaApi.Contrller;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Medicamento;
import com.Api.clinicaApi.Service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicamentos")
@CrossOrigin(origins = {"*"})
public class MedicamentoController {
    @Autowired
    private MedicamentoService medicamentoService;

    @GetMapping
    public List<Medicamento> listarMedicamento() {
        return medicamentoService.listarMedicamento();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medicamento> obtenerMedicamentoPorId(@PathVariable Long id) {
        return medicamentoService.obtenerMedicamentoPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
