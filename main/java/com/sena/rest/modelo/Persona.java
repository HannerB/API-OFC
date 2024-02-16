package com.sena.rest.modelo;

public class Persona {

    private String cedula;
    private String nombre;
    private Double valorVentasMes;
    private Double valorAPagar;
    private int edad;
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getValorVentasMes() {
        return valorVentasMes;
    }

    
    public void setValorVentasMes(Double valorVentasMes) {
        this.valorVentasMes = valorVentasMes;
    }

    public Double getValorAPagar() {      
       if(this.edad >= 18){
           this.valorAPagar = 1000000.0 + (this.valorVentasMes * 3/100) * 10/100;
        }else{
           this.valorAPagar = 1000000.0 + (this.valorVentasMes * 10/100) + 300000.0;
        }
        return valorAPagar;
    }

    
}
