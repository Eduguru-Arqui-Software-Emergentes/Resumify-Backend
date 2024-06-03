package org.emergentes.resumify.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResumenResource {
    private Long id;
    private String name;
    private String content;
    private String dayAdded;
    private String Link;
}
