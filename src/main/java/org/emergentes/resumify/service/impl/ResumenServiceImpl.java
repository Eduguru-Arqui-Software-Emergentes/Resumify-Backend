package org.emergentes.resumify.service.impl;

import org.emergentes.resumify.entity.Resumen;
import org.emergentes.resumify.entity.Usuario;
import org.emergentes.resumify.repository.ResumenRepository;
import org.emergentes.resumify.repository.UsuarioRepository;
import org.emergentes.resumify.service.ResumenService;
import org.emergentes.resumify.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumenServiceImpl implements ResumenService {

    @Autowired
    private ResumenRepository resumenRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Resumen> getAllResumenes() {
        return resumenRepository.findAll();
    }

    @Override
    public Resumen createResumen(Resumen resumen, Long usuarioId) {
        resumen.setUsuario(usuarioRepository.findById(usuarioId).orElse(null));
        return resumenRepository.save(resumen);
    }

    @Override
    public Resumen updateResumen(Long id, Resumen resumen) {
        Resumen res = resumenRepository.findById(id).orElseThrow();
        res.setName(resumen.getName());
        res.setContent(resumen.getContent());
        res.setDayAdded(resumen.getDayAdded());
        res.setLink(resumen.getLink());

        return resumenRepository.save(resumen);
    }

    @Override
    public Resumen getResumenById(Long id) {
        return resumenRepository.findById(id).orElse(null);
    }

    @Override
    public List<Resumen> getAllResumenesByUsuarioId(Long usuarioId) {
        Usuario usuario = usuarioRepository.findById(usuarioId).orElse(null);
        return resumenRepository.findByUsuario(usuario);
    }

    @Override
    public Resumen getByName(String name) {
        return resumenRepository.findByName(name);
    }
}
