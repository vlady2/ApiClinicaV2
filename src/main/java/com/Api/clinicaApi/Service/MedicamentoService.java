package com.Api.clinicaApi.Service;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Medicamento;
import com.Api.clinicaApi.Repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicamentoService {

    @Autowired
    private MedicamentoRepository medicamentoRepository;

    public List<Medicamento> listarMedicamento() {
        return medicamentoRepository.findAll();
    }

    public Optional<Medicamento> obtenerMedicamentoPorId(Long id) {
        return medicamentoRepository.findById(id);
    }

    public Medicamento guardarMedicamento(Medicamento medicamento) {
        return medicamentoRepository.save(medicamento);
    }

    public Medicamento actualizarMedicamento(Long id, Medicamento medicamentoActualizada) {
        return medicamentoRepository.findById(id).map(medicamento -> {
            medicamento.setIdMedicamento(medicamentoActualizada.getIdMedicamento());
            medicamento.setNombre(medicamentoActualizada.getNombre());
            medicamento.setPrincipioActivo(medicamentoActualizada.getPrincipioActivo());
            medicamento.setDosis(medicamentoActualizada.getDosis());
            return medicamentoRepository.save(medicamento);
        }).orElseThrow(() -> new RuntimeException("Medicamento no encontrada"));
    }

    public void eliminarMedicamento(Long id) {
        medicamentoRepository.deleteById(id);
    }

}
