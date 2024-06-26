package org.emergentes.resumify.service.impl;

import org.emergentes.resumify.entity.*;
import org.emergentes.resumify.repository.UsuarioRepository;
import org.emergentes.resumify.request.*;
import org.emergentes.resumify.response.AuthenticationResponse;
import org.emergentes.resumify.service.AuthenticationService;
import org.emergentes.resumify.service.JWTService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UsuarioRepository usuarioRepository;
    private final AuthenticationManager authenticationManager;
    private final JWTService jwtService;

    @Override
    public Usuario signUpUser(SignUpRequest signUpRequest) {
        Usuario usuario = new Usuario();
        if (usuarioRepository.findByUserName(signUpRequest.getUserName()).isPresent()) {
            throw new IllegalArgumentException("El nombre de usuario ya existe");
        }
        if (usuarioRepository.findByEmail(signUpRequest.getEmail()).isPresent()) {
            throw new IllegalArgumentException("El email ya existe");
        }
        usuario.setName(signUpRequest.getName());
        usuario.setUserName(signUpRequest.getUserName());
        usuario.setEmail(signUpRequest.getEmail());
        if (signUpRequest.getRole() != null && Objects.equals(signUpRequest.getRole().toUpperCase(), "ADMIN")) {
            usuario.setRole(Role.ADMIN);
        } else {
            usuario.setRole(Role.USER);
        }
        usuario.setPassword(new BCryptPasswordEncoder().encode(signUpRequest.getPassword()));
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario signUpAdmin(SignUpRequest signUpRequest) {
        Usuario usuario = new Usuario();
        usuario.setName(signUpRequest.getName());
        usuario.setUserName(signUpRequest.getUserName());
        usuario.setEmail(signUpRequest.getEmail());
        usuario.setRole(Role.ADMIN);
        usuario.setPassword(new BCryptPasswordEncoder().encode(signUpRequest.getPassword()));
        return usuarioRepository.save(usuario);
    }

    //MEOTODO DE LOGIN
    @Override
    public AuthenticationResponse signin(SignInRequest signInRequest) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                signInRequest.getUserName(),signInRequest.getPassword()));
        Usuario user = usuarioRepository.findByUserName(signInRequest.getUserName())
                .orElseThrow(() -> new IllegalArgumentException("Username isn't valid"));

        String jwt = jwtService.generateToken(user);
        return new AuthenticationResponse(jwt, user.getId(), user.getUsername(), user.getRole().name(), user.getAuthorities());
    }
}
