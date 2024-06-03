package org.emergentes.resumify.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("resumifyMappingConfiguration")
public class MappingConfiguration {
    @Bean
    public UsuarioMapper usuarioMapper(){return new UsuarioMapper();}

    @Bean
    public ResumenMapper resumenMapper(){return new ResumenMapper();}
}
