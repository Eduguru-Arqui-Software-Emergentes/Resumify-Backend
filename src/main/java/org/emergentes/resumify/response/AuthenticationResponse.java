package org.emergentes.resumify.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Nullable;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

@Getter
@Setter
public class AuthenticationResponse {
    private String token;
    private String bearer = "Bearer";
    private String userName;
    private String role;
    @JsonIgnore
    private Collection<? extends GrantedAuthority> authorities;

    public AuthenticationResponse(String token, String userName, String role, Collection<? extends GrantedAuthority> authorities) {
        this.token = token;
        this.userName = userName;
        this.role = role;
        this.authorities = authorities;
    }
}
