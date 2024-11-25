package com.Api.clinicaApi.Service;

import com.Api.clinicaApi.Model.Cita;
import com.Api.clinicaApi.Model.Inventario;
import com.Api.clinicaApi.Repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventarioService {
    @Autowired
    private InventarioRepository repository;

    public List<Inventario> listarInventario() {
        return repository.findAll();
    }

    public Optional<Inventario> obtenerInventarioPorId(Long id) {
        return repository.findById(id);
    }

    public Inventario guardarInventario(Inventario inventario) {
        return repository.save(inventario);
    }

    public Inventario actualizarInventario(Long id, Inventario inventarioActualizada) {
        return repository.findById(id).map(inventario -> {
            inventario.setIdInventario(inventarioActualizada.getIdInventario());
            inventario.setProducto(inventarioActualizada.getProducto());
            inventario.setCantidad(inventarioActualizada.getCantidad());
            inventario.setFechaVencimiento(inventarioActualizada.getFechaVencimiento());
            return repository.save(inventario);
        }).orElseThrow(() -> new RuntimeException("Inventario no encontrada"));
    }

    public void eliminarInventario(Long id) {
        repository.deleteById(id);
    }

}
