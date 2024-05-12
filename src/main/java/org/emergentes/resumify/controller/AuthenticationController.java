package org.emergentes.resumify.controller;

import org.emergentes.resumify.request.SignInRequest;
import org.emergentes.resumify.request.SignUpRequest;
import org.emergentes.resumify.response.AuthenticationResponse;
import org.emergentes.resumify.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.emergentes.resumify.util.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/autenticacion")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<?> signUpUser(@Valid @RequestBody SignUpRequest signUpRequest, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return new ResponseEntity<>(new Message("Campos incorrectos o email inválido"), HttpStatus.BAD_REQUEST);
        }
        try {
            authenticationService.signUpUser(signUpRequest);
            return new ResponseEntity<>(new Message("Usuario registrado correctamente"), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(new Message(e.getMessage()), HttpStatus.BAD_REQUEST);
        }
    }
    /*@PostMapping("/signupadmin")
    public ResponseEntity<Usuario> signUpAdmin(@RequestBody SignUpRequest signUpRequest){
        return ResponseEntity.ok(authenticationService.signUpAdmin(signUpRequest));
    }*/

    @PostMapping("/signin")
    public ResponseEntity<?> signin(@Valid @RequestBody SignInRequest signInRequest, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(authenticationService.signin(signInRequest));
    }

}
