package org.emergentes.resumify.repository;

import org.emergentes.resumify.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
        Optional<Usuario> findByEmail(String email);
        Optional<Usuario> findByUserName(String userName);

}
