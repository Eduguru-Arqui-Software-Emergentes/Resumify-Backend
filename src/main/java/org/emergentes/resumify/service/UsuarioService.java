package org.emergentes.resumify.service;

import org.emergentes.resumify.entity.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    UserDetailsService userDetailsService();

    /*List<Usuario> getAllUsuarios();
    Usuario createUsuario(Usuario usuario);
    Usuario updateUsuario(Long id, Usuario usuario);*/

}
