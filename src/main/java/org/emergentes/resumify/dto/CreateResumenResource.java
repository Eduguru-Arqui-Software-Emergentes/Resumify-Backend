package org.emergentes.resumify.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateResumenResource {
    private String name;
    private String content;
    private String dayAdded;
    private String Link;
}
