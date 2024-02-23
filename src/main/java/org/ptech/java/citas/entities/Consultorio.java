package org.ptech.java.citas.entities;

public class Consultorio {
    private int id;
    private String direccion;
    private Long numero;
    
    //Consultor por defecto
    public Consultorio() {
    }

    //constructor parametrizado
    public Consultorio(int id, String direccion, Long numero) {
        this.id = id;
        this.direccion = direccion;
        this.numero = numero;
    }

    //Ecncapsulados getter y setter
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    
}
