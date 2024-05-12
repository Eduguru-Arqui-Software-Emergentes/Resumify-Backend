package org.emergentes.resumify.service.impl;

import org.emergentes.resumify.repository.UsuarioRepository;
import org.emergentes.resumify.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
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
}
