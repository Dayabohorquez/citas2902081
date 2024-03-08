package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.TipoDocumento;

//Clase padre
//Superclase
//Clase maestra 
//Clase base
public  class Usuario {

    //atributos a heredarse
    //deben ser protected
    protected int id;
    protected String nombres;
    protected String apellidos; 
    protected TipoDocumento tipoDocumento;
    protected Long numeroIdentificación;


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

    
}
