package com.Api.clinicaApi.Contrller;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Especialidad;
import com.Api.clinicaApi.Service.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/especialidades")
@CrossOrigin(origins = {"*"})
public class EspecialidadController {
    @Autowired
    private EspecialidadService especialidadService;

    @GetMapping
    public List<Especialidad> listarEspecialidad() {
        return especialidadService.listarEspecialidad();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Especialidad> obtenerEspecialidadPorId(@PathVariable Long id) {
        return especialidadService.obtenerEspecialidadPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
