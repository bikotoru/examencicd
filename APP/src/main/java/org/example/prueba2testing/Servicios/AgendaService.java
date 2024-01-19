package org.example.prueba2testing.Servicios;

import org.example.prueba2testing.Model.Agenda;
import org.example.prueba2testing.Model.Dueño;
import org.example.prueba2testing.Model.Mascota;
import org.example.prueba2testing.Repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaService {

    private final AgendaRepository agendaRepository;
    private final DueñoService dueñoService;
    private final MascotaService mascotaService;

    @Autowired
    public AgendaService(AgendaRepository agendaRepository, DueñoService dueñoService, MascotaService mascotaService) {
        this.agendaRepository = agendaRepository;
        this.dueñoService = dueñoService;
        this.mascotaService = mascotaService;
    }

    public Agenda crearCita(Agenda agenda) {

        return agendaRepository.save(agenda);

    }

    public List<Agenda> listarCitas() {
        return agendaRepository.findAll();
    }


}
