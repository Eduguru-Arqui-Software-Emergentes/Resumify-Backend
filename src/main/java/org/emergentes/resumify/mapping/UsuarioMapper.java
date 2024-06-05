package org.emergentes.resumify.mapping;

import org.emergentes.resumify.dto.CreateUsuarioResource;
import org.emergentes.resumify.dto.UpdateUsuarioResource;
import org.emergentes.resumify.dto.UsuarioResource;
import org.emergentes.resumify.entity.Usuario;
import org.emergentes.resumify.util.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public class UsuarioMapper implements Serializable {

    @Autowired
    private EnhancedModelMapper modelMapper;

    public UsuarioResource toResource(Usuario user) {
        return modelMapper.map(user, UsuarioResource.class);
    }

    public List<UsuarioResource> toResource(List<Usuario> users) {
        return modelMapper.mapList(users, UsuarioResource.class);
    }

    public Usuario toEntity(CreateUsuarioResource user) {
        return modelMapper.map(user, Usuario.class);
    }

    public Usuario toEntity(UpdateUsuarioResource user) {
        return modelMapper.map(user, Usuario.class);
    }

}
