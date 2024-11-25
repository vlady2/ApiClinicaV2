package com.Api.clinicaApi.Service;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Medico;
import com.Api.clinicaApi.Repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {
    @Autowired
    private MedicoRepository medicoRepository;

    public List<Medico> listarMedico() {
        return medicoRepository.findAll();
    }

    public Optional<Medico> obtenerMedicoPorId(Long id) {
        return medicoRepository.findById(id);
    }

    public Medico guardarMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    public Medico actualizarMedico(Long id, Medico medicoActualizada) {
        return medicoRepository.findById(id).map(medico -> {
            medico.setIdMedico(medicoActualizada.getIdMedico());
            medico.setNombre(medicoActualizada.getNombre());
            medico.setApellidos(medicoActualizada.getApellidos());
            medico.setDUI(medicoActualizada.getDUI());
            medico.setIdEspecialidad(medicoActualizada.getIdEspecialidad());
            medico.setHoraAtencion(medicoActualizada.getHoraAtencion());
            medico.setEstado(medicoActualizada.getEstado());
            return medicoRepository.save(medico);
        }).orElseThrow(() -> new RuntimeException("Medico no encontrada"));
    }

    public void eliminarMedico(Long id) {
        medicoRepository.deleteById(id);
    }
}
