package com.sena.rest.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.rest.modelo.Persona;
import com.sena.rest.repository.EmpresaRepository;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;

    public Persona getLiquidar(String cc, String nombre, Double valorVentas, int edad) {
         
        Persona persona = new Persona();
        persona.setCedula(cc);
        persona.setNombre(nombre);
        persona.setValorVentasMes(valorVentas);
        persona.setEdad(edad);


        return persona;
    }

    public List<Persona> getListar() {
        List<Persona> personaList;
        personaList =  empresaRepository.getPersonas();
         return personaList; 
        
    }
    
    public List<Persona> getListarTodos() {
           List<Persona> personaListTodos ;        
            personaListTodos =  empresaRepository.getPersonas(); 
        return personaListTodos;
    }

    public List<Persona> getListarOrdenadoPorEdad() {
         List<Persona> personaListaOrdenada ;        
            personaListaOrdenada =  empresaRepository.getPersonas();
        return personaListaOrdenada.stream()
                                       .sorted(Comparator.comparingInt(Persona::getEdad))
                                       .collect(Collectors.toList());
    }

    public List<Persona> getListarOrdenadoPorValorAPagar() {
        List<Persona> personaListaOrdenada ;        
            personaListaOrdenada =  empresaRepository.getPersonas();
        return personaListaOrdenada.stream()
                                       .sorted(Comparator.comparingDouble(Persona::getValorAPagar).reversed())
                                       .collect(Collectors.toList());
    }
    
}
