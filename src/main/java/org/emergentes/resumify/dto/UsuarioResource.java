package org.emergentes.resumify.dto;

import lombok.Getter;
import lombok.Setter;
import org.emergentes.resumify.entity.Role;

@Getter
@Setter
public class UsuarioResource {
    private Long id;
    private String name;
    private String userName;
    private String email;
    private String password;
    //private Role role;
}
