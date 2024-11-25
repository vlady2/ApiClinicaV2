package com.Api.clinicaApi.Service;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Procedimiento;
import com.Api.clinicaApi.Repository.ProcedimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProcedimientoService {

    @Autowired
    private ProcedimientoRepository procedimientoRepository;

    public List<Procedimiento> listarProcedimiento() {
        return procedimientoRepository.findAll();
    }

    public Optional<Procedimiento> obtenerProcedimientoPorId(Long id) {
        return procedimientoRepository.findById(id);
    }

    public Procedimiento guardarProcedimiento(Procedimiento procedimiento) {
        return procedimientoRepository.save(procedimiento);
    }

    public Procedimiento actualizarProcedimiento(Long id, Procedimiento procedimientoActualizada) {
        return procedimientoRepository.findById(id).map(procedimiento -> {
            procedimiento.setIdProcedimiento(procedimientoActualizada.getIdProcedimiento());
            procedimiento.setNombre(procedimientoActualizada.getNombre());
            procedimiento.setDescripcion(procedimientoActualizada.getDescripcion());
            return procedimientoRepository.save(procedimiento);
        }).orElseThrow(() -> new RuntimeException("Procedimiento no encontrada"));
    }

    public void eliminarProcedimiento(Long id) {
        procedimientoRepository.deleteById(id);
    }
}
