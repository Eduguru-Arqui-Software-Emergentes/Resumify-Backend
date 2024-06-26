package org.emergentes.resumify.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResumenResource {
    private Long id;
    private String title;
    private String thumbnail;
    private String content;
    private String dayAdded;
    private String Link;
}
