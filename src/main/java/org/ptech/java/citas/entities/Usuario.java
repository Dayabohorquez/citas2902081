package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;

//Clase padre
//Superclase
//Clase maestra 
//Clase base
abstract class Usuario {

    //atributos a heredarse
    //deben ser protected
    protected int id;
    protected String nombres;
    protected String apellidos; 
    protected TipoDocumento tipoDocumento;
    protected Long numeroIdentificación;
    private Especialidad especialidad;
    private Double altura;
    private Double peso;
    private TipoSangre tipoSangre;
    private String email;
    private char factorRH;


    //sobreescribir el metodo toString
    

    public Usuario(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroIdentificación) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroIdentificación = numeroIdentificación;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + 
                        id + 
                        ", nombres=" + 
                        nombres + 
                        ", apellidos=" + 
                        apellidos + 
                        ", tipoDocumento=" + 
                        tipoDocumento + 
                        ", numeroIdentificación=" + 
                        numeroIdentificación + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Long getNumeroIdentificación() {
        return numeroIdentificación;
    }

    public void setNumeroIdentificación(Long numeroIdentificación) {
        this.numeroIdentificación = numeroIdentificación;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getFactorRH() {
        return factorRH;
    }

    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }


    
}
