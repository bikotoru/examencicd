package org.example.prueba2testing.Servicios;

import org.example.prueba2testing.Model.Mascota;
import org.example.prueba2testing.Repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService {

    private final MascotaRepository mascotaRepository;

    @Autowired
    public MascotaService(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }
    public Mascota buscarMascotaPorId(Long idMascota) {
        return mascotaRepository.findById(idMascota).orElse(null);
    }

    public List<Mascota> obtenerTodasLasMascotas() {
        return mascotaRepository.findAll();
    }

    public Mascota guardarMascota(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    public void eliminarMascota(Long idMascota) {
        mascotaRepository.deleteById(idMascota);
    }

}
