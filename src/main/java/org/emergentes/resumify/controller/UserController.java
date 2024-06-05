package org.emergentes.resumify.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.emergentes.resumify.dto.CreateUsuarioResource;
import org.emergentes.resumify.dto.UpdateUsuarioResource;
import org.emergentes.resumify.dto.UsuarioResource;
import org.emergentes.resumify.mapping.UsuarioMapper;
import org.emergentes.resumify.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "User", description = "User API")
@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private UsuarioMapper usuarioMapper;

    @GetMapping("/hola")
    public ResponseEntity<String> saludoAdmin(){
        return ResponseEntity.ok("Hola Usuario");
    }

    @Operation(summary = "Get all users", description = "Get all users")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found all users"),
            @ApiResponse(responseCode = "404", description = "users not found")})
    @GetMapping
    public List<UsuarioResource> getAllUsuarios() {
        return usuarioMapper.toResource(usuarioService.getAllUsuarios());
    }

    /*@Operation(summary = "Create User", description = "Create User")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Created User"),
            @ApiResponse(responseCode = "404", description = "User not created")})
    @PostMapping("/create")
    public UsuarioResource createUsuario(@RequestBody CreateUsuarioResource createUsuarioResource){
        return usuarioMapper.toResource(usuarioService.createUsuario(usuarioMapper.toEntity(createUsuarioResource)));
    }*/

    @Operation(summary = "Update User", description = "Update User")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Updated User"),
            @ApiResponse(responseCode = "404", description = "User not updated")})
    @PutMapping("/{id}")
    public UsuarioResource updateUsuario(@PathVariable(name= "id") Long id, @RequestBody UpdateUsuarioResource updateUsuarioResource){
        return usuarioMapper.toResource(usuarioService.updateUsuario(id,
                usuarioMapper.toEntity(updateUsuarioResource)));
    }


}
