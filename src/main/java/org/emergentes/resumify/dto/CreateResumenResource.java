package org.emergentes.resumify.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateResumenResource {
    private String title;
    private String content;
    private String thumbnail;
    private String dayAdded;
    private String Link;
}
