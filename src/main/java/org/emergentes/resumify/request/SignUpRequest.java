package org.emergentes.resumify.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class SignUpRequest {
    @NotNull
    private String name;
    @NotNull
    private String userName;
    @NotNull
    private String email;
    @NotNull
    private String password;
    private String role;
}
