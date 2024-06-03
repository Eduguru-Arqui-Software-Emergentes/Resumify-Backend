package org.emergentes.resumify.service.impl;

import org.emergentes.resumify.entity.Usuario;
import org.emergentes.resumify.repository.UsuarioRepository;
import org.emergentes.resumify.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    public UsuarioRepository usuarioRepository;

    @Override
    public UserDetailsService userDetailsService() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                return usuarioRepository.findByUserName(username).orElseThrow( ()->
                        new UsernameNotFoundException("Usuario no encontrado"));
            }
        };
    }

    /*@Override
    public List<Usuario> getAllUsuarios(){
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario createUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario updateUsuario(Long id, Usuario usuario){
        Usuario usuario_updated = usuarioRepository.findById(id).orElseThrow();
        usuario_updated.setName(usuario.getName());
        usuario_updated.setUserName(usuario.getUsername());
        usuario_updated.setEmail(usuario.getEmail());
        usuario_updated.setPassword(usuario.getPassword());
        //usuario_updated.setRole(usuario.getRole());

        return usuarioRepository.save(usuario_updated);
    }*/

}
