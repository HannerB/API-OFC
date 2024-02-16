package com.sena.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sena.rest.modelo.Persona;
import com.sena.rest.service.EmpresaService;


@CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.GET, RequestMethod.POST}, allowedHeaders = "*", allowCredentials = "true")
@RestController

public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @GetMapping("/api/empresa/liquidar/{cc}/{nombre}/{valorVentas}/{edad}")
    Persona getLiquidar(@PathVariable String cc, 
                       @PathVariable String nombre, 
                       @PathVariable Double valorVentas,
                        @PathVariable int edad){
                        return empresaService.getLiquidar(cc, nombre,valorVentas,edad );
                       }
                       
    @GetMapping("/api/empresa/listar")
    public List<Persona> getListar(){
        return empresaService.getListar();
    }

    @GetMapping("/api/personas/listar-todas")
    List<Persona> listarTodasLasPersonas() {
        return empresaService.getListarTodos();
    }

    @GetMapping("/api/personas/listar-por-edad")
    List<Persona> listarPersonasPorEdad() {
        return empresaService.getListarOrdenadoPorEdad();
    }

    @GetMapping("/api/personas/listar-por-valor-a-pagar")
    List<Persona> listarPersonasPorValorAPagar() {
        return empresaService.getListarOrdenadoPorValorAPagar();
    }

    @GetMapping("/api/personas/obtener-por-cedula/{cedula}")
    Persona obtenerPersonaPorCedula(@PathVariable String cedula) {
        return empresaService.obtenerPersonaPorCedula(cedula);
    }
    
    @PutMapping("/api/personas/editar/{cedula}")
    Persona editarPersona(@PathVariable String cedula, @RequestBody Persona persona) {
        return empresaService.editarPersona(cedula, persona);
    }

}
