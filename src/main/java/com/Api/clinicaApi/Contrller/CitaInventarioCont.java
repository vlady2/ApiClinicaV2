package com.Api.clinicaApi.Contrller;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.CitaInventario;
import com.Api.clinicaApi.Service.CitaInventarioServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/citaInventarios")
public class CitaInventarioCont {
    @Autowired
    private CitaInventarioServ citaInventarioServ;

    @GetMapping
    public List<CitaInventario> listarCitaInventario() {
        return citaInventarioServ.listarCitasInv();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CitaInventario> obtenerCitaInventarioPorId(@PathVariable Long id) {
        return citaInventarioServ.obtenerCitaInvPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public CitaInventario crearCitaInventario(@RequestBody CitaInventario citaInventario) {
        return citaInventarioServ.guardarCitaInv(citaInventario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CitaInventario> actualizarCitaInventario(@PathVariable Long id, @RequestBody CitaInventario citaInventario) {
        try {
            return ResponseEntity.ok(citaInventarioServ.actualizarCitaInv(id, citaInventario));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCitaInventario(@PathVariable Long id) {
        citaInventarioServ.eliminarCitaInv(id);
        return ResponseEntity.noContent().build();
    }
}
