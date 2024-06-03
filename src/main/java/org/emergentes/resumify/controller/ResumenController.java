package org.emergentes.resumify.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.emergentes.resumify.dto.CreateResumenResource;
import org.emergentes.resumify.dto.ResumenResource;
import org.emergentes.resumify.dto.UpdateResumenResource;
import org.emergentes.resumify.mapping.ResumenMapper;
import org.emergentes.resumify.repository.ResumenRepository;
import org.emergentes.resumify.service.ResumenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Resumen", description = "Resumen API")
@RestController
@RequestMapping("/api/v1/resumen")
@CrossOrigin
public class ResumenController {

    @Autowired
    private ResumenService resumenService;

    @Autowired
    private ResumenMapper resumenMapper;

    @Autowired
    private ResumenRepository resumenRepository;

    @Operation(summary = "Get all Resumenes", description = "Get all Resumenes")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found all Resumenes"),
            @ApiResponse(responseCode = "404", description = "Resumenes not found")})
    @GetMapping
    public List<ResumenResource> getAllResumenes() {
        return resumenMapper.toResource(resumenService.getAllResumenes());
    }

    @Operation(summary = "Create Resumen", description = "Create Resumen")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Created Resumen"),
            @ApiResponse(responseCode = "404", description = "Resumen not created")})
    @PostMapping("{usuarioId}/create")
    public ResponseEntity<?> createResumen(
            @RequestBody CreateResumenResource createResumenResource,
            @PathVariable("usuarioId") Long usuarioId
    ){
        if(resumenRepository.findByName(createResumenResource.getName()) != null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ese Nombre ya existe");
        }else{
            ResumenResource resumenResource = resumenMapper.toResource(
              resumenService.createResumen(resumenMapper.toEntity(createResumenResource),usuarioId)
            );
            return ResponseEntity.ok(resumenResource);
        }
    }

    @Operation(summary = "Get resumen by Name", description = "Get resumen by Name")
    @GetMapping("name/{name}")
    public ResumenResource getResumenByName(@PathVariable String name) {
        return resumenMapper.toResource(resumenService.getByName(name));
    }

    public class ResumenAlreadyExistsException extends RuntimeException {
        public ResumenAlreadyExistsException(String message) {
            super(message);
        }
    }

    @Operation(summary = "Update Resumen", description = "Update Resumen")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Updated Resumen"),
            @ApiResponse(responseCode = "404", description = "Resumen not updated")})
    @PutMapping("/{id}")
    public ResumenResource updateResumen(@PathVariable(name = "id") Long id, @RequestBody UpdateResumenResource updateResumenResource) {
        return resumenMapper.toResource(resumenService.updateResumen(id,
                resumenMapper.toEntity(updateResumenResource)));
    }

}
