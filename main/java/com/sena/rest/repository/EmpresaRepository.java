package com.sena.rest.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.sena.rest.modelo.Persona;

@Service
public class EmpresaRepository {

    public List<Persona> getPersonas(){

         ArrayList<Persona> personaList = new ArrayList<Persona>();
        
        Persona persona = new Persona();        
        persona.setCedula("523"); 
        persona.setNombre("José"); 
        persona.setValorVentasMes(2000000.0); 
        persona.setEdad(67); 
        
        Persona persona1 = new Persona();
        persona1.setCedula("456"); 
        persona1.setNombre("Santiago"); 
        persona1.setValorVentasMes(2500000.0); 
        persona1.setEdad(25); 
        
        Persona persona2 = new Persona(); 
        persona2.setCedula("789");
        persona2.setNombre("Laura"); 
        persona2.setValorVentasMes(3000000.0); 
        persona2.setEdad(16); 
        
        Persona persona3 = new Persona(); 
        persona3.setCedula("098"); 
        persona3.setNombre("Deiner"); 
        persona3.setValorVentasMes(3000000.0); 
        persona3.setEdad(45); 
        
        Persona persona4 = new Persona(); 
        persona4.setCedula("345"); 
        persona4.setNombre("Henry"); 
        persona4.setValorVentasMes(3000000.0); 
        persona4.setEdad(45); 
        
        Persona persona5 = new Persona(); 
        persona5.setCedula("077"); 
        persona5.setNombre("Wendy"); 
        persona5.setValorVentasMes(3000000.0); 
        persona5.setEdad(38); 
        
        Persona persona6 = new Persona(); 
        persona6.setCedula("267"); 
        persona6.setNombre("Yesid"); 
        persona6.setValorVentasMes(3000000.0); 
        persona6.setEdad(17); 
        
        Persona persona7 = new Persona(); 
        persona7.setCedula("482"); 
        persona7.setNombre("Juan"); 
        persona7.setValorVentasMes(3000000.0); 
        persona7.setEdad(19); 
        
        Persona persona8 = new Persona(); 
        persona8.setCedula("911"); 
        persona8.setNombre("Maria Victoria"); 
        persona8.setValorVentasMes(3000000.0); 
        persona8.setEdad(65); 
        
        Persona persona9 = new Persona(); 
        persona9.setCedula("656"); 
        persona9.setNombre("Jonás"); 
        persona9.setValorVentasMes(3000000.0); 
        persona9.setEdad(17); 
        
        Persona persona10 = new Persona(); 
        persona10.setCedula("123"); 
        persona10.setNombre("Nicolás"); 
        persona10.setValorVentasMes(2500000.0); 
        persona10.setEdad(21); 
        
        Persona persona11= new Persona(); 
        persona11.setCedula("123"); 
        persona11.setNombre("Laura"); 
        persona11.setValorVentasMes(3000000.0); 
        persona11.setEdad(34); 
        
        Persona persona12 = new Persona(); 
        persona12.setCedula("123"); 
        persona12.setNombre("Daniel"); 
        persona12.setValorVentasMes(5000000.0); 
        persona12.setEdad(24); 
        
        Persona persona13 = new Persona(); 
        persona13.setCedula("123"); 
        persona13.setNombre("Ernesto"); 
        persona13.setValorVentasMes(2500000.0); 
        persona13.setEdad(21); 
        
        Persona persona14 = new Persona(); 
        persona14.setCedula("123"); 
        persona14.setNombre("Jairo"); 
        persona14.setValorVentasMes(3500000.0); 
        persona14.setEdad(35); 
        
        Persona persona15 = new Persona(); 
        persona15.setCedula("123"); 
        persona15.setNombre("Luna"); 
        persona15.setValorVentasMes(1000000.0); 
        persona15.setEdad(23); 
        
        Persona persona16 = new Persona(); 
        persona16.setCedula("123"); 
        persona16.setNombre("Junior"); 
        persona16.setValorVentasMes(6000000.0); 
        persona16.setEdad(23); 
        
        Persona persona17 = new Persona(); 
        persona17.setCedula("123"); 
        persona17.setNombre("Leticia"); 
        persona17.setValorVentasMes(5000000.0); 
        persona17.setEdad(42); 
        
        Persona persona18 = new Persona(); 
        persona18.setCedula("123"); 
        persona18.setNombre("Carol"); 
        persona18.setValorVentasMes(8500000.0); 
        persona18.setEdad(17); 
        
        Persona persona19 = new Persona(); 
        persona19.setCedula("123"); 
        persona19.setNombre("Liz"); 
        persona19.setValorVentasMes(3000000.0); 
        persona19.setEdad(16); 
        
        Persona persona20 = new Persona(); 
        persona20.setCedula("123"); 
        persona20.setNombre("Jeff"); 
        persona20.setValorVentasMes(2000000.0); 
        persona20.setEdad(17); 
        
        Persona persona21 = new Persona(); 
        persona21.setCedula("123"); 
        persona21.setNombre("Josue"); 
        persona21.setValorVentasMes(2900000.0); 
        persona21.setEdad(18); 
        
        Persona persona22 = new Persona(); 
        persona22.setCedula("123"); 
        persona22.setNombre("Carlos"); 
        persona22.setValorVentasMes(3700000.0); 
        persona22.setEdad(16); 
        
        Persona persona23 = new Persona(); 
        persona23.setCedula("123"); 
        persona23.setNombre("Juan"); 
        persona23.setValorVentasMes(2500000.0); 
        persona23.setEdad(18);

        Persona persona24 = new Persona(); 
        persona24.setCedula("123"); 
        persona24.setNombre("Josefina"); 
        persona24.setValorVentasMes(6000000.0); 
        persona24.setEdad(16);

    
        personaList.add(persona); 
        personaList.add(persona1); 
        personaList.add(persona2); 
        personaList.add(persona3); 
        personaList.add(persona4);
        personaList.add(persona5);
        personaList.add(persona6);
        personaList.add(persona7);
        personaList.add(persona8);
        personaList.add(persona9); 
        personaList.add(persona10); 
        personaList.add(persona11); 
        personaList.add(persona12); 
        personaList.add(persona13); 
        personaList.add(persona14);
        personaList.add(persona15);
        personaList.add(persona16); 
        personaList.add(persona17); 
        personaList.add(persona18); 
        personaList.add(persona19); 
        personaList.add(persona20);
        personaList.add(persona21);
        personaList.add(persona22); 
        personaList.add(persona23);
        personaList.add(persona24);

        return personaList;

    }

    
}
