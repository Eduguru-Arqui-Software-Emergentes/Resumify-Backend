package org.emergentes.resumify.mapping;

import org.emergentes.resumify.dto.CreateResumenResource;
import org.emergentes.resumify.dto.ResumenResource;
import org.emergentes.resumify.dto.UpdateResumenResource;
import org.emergentes.resumify.dto.UpdateUsuarioResource;
import org.emergentes.resumify.entity.Resumen;
import org.emergentes.resumify.util.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public class ResumenMapper implements Serializable {

    @Autowired
    private EnhancedModelMapper modelMapper;

    public ResumenResource toResource(Resumen resumen){return  modelMapper.map(resumen, ResumenResource.class);}

    public List<ResumenResource> toResource(List<Resumen> resumen){
        return modelMapper.mapList(resumen, ResumenResource.class);
    }

    public Resumen toEntity(CreateResumenResource resumen){
        return modelMapper.map(resumen, Resumen.class);
    }



    public Resumen toEntity(UpdateResumenResource resumen) {
        return modelMapper.map(resumen, Resumen.class);
    }
}
