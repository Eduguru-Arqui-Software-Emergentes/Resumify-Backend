package org.emergentes.resumify.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUsuarioResource {
    private String name;
    private String userName;
    private String email;
    private String password;
}
