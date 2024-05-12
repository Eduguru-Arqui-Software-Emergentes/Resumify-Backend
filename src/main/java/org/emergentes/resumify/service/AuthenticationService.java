package org.emergentes.resumify.service;

import org.emergentes.resumify.entity.Usuario;
import org.emergentes.resumify.request.SignInRequest;
import org.emergentes.resumify.request.SignUpRequest;
import org.emergentes.resumify.response.AuthenticationResponse;

public interface AuthenticationService {
    Usuario signUpUser(SignUpRequest signUpRequest);
    Usuario signUpAdmin(SignUpRequest signUpRequest);
    AuthenticationResponse signin(SignInRequest signInRequest);
    //AuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
