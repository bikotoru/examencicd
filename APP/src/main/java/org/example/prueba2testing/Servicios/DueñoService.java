package org.example.prueba2testing.Servicios;

import org.example.prueba2testing.Model.Dueño;
import org.example.prueba2testing.Repository.DueñoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DueñoService {

    private final DueñoRepository dueñoRepository;

    @Autowired
    public DueñoService(DueñoRepository dueñoRepository) {
        this.dueñoRepository = dueñoRepository;
    }

    public Dueño buscarDueñoPorRut(String rut) {
        return dueñoRepository.findById(rut).orElse(null);
    }

    public List<Dueño> obtenerTodosLosDueños() {
        return dueñoRepository.findAll();
    }

    public Dueño guardarDueño(Dueño dueño) {
        return dueñoRepository.save(dueño);
    }

    public void eliminarDueño(String rut) {
        dueñoRepository.deleteById(rut);
    }

}
