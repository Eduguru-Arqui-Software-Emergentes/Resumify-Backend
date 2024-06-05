package org.emergentes.resumify.service;

import org.emergentes.resumify.entity.Resumen;

import java.util.List;

public interface ResumenService {

    List<Resumen> getAllResumenes();
    Resumen createResumen(Resumen resumen, Long usuarioId);
    Resumen updateResumen(Long id, Resumen resumen);
    Resumen getResumenById(Long id);

    List<Resumen> getAllResumenesByUsuarioId(Long usuarioId);
    Resumen getByName(String name);

}
