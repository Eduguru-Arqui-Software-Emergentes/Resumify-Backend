package org.emergentes.resumify.repository;

import org.emergentes.resumify.entity.Resumen;
import org.emergentes.resumify.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResumenRepository extends JpaRepository<Resumen, Long> {

    Resumen findByName(String name);

    List<Resumen> findByUsuario(Usuario usuario);

}
