package org.example.prueba2testing.Servicios;

import org.example.prueba2testing.Model.Usuario;
import org.example.prueba2testing.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    public Usuario iniciarSesion(String nombreUsuario, String password) {
        return usuarioRepository.findByNombreUsuarioAndPassword(nombreUsuario, password);
    }

}
