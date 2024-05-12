package org.emergentes.resumify.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class SignInRequest {
    @NotBlank
    private String userName;
    @NotBlank
    private String password;
}
