package org.ptech.java.citas.entities;

public class Medico {

    //POR REGLA GENERAL:
    //Los atribustos de una clase 
    //deben ser private
    private int id;
    private String nombres;
    private String apellidos; 
    private TipoDocumento tipoDocumento;
    private Long numeroIdentificación;       
    private Long registroMedico; 
    private Especialidad especialidad;

    //Consultor por defecto
    public Medico() {
    }
    
    //constructor parametrizado
    public Medico(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroIdentificación,
            Long registroMedico, Especialidad especialidad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroIdentificación = numeroIdentificación;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    //Ecncapsulados getter y setter
    //Getters y Setters 
    //deben ser publicos
    //Firma de un Getter:
    //Tipo de dato de retorno:
    // es el t.d del atributo 
    // Nombre del metodo:
    //      get seguido del nombre del atributo
    // Parametros 0 
    // retorna: El valor del atributo 
    public String getNombres() {
        //return sirve para
        //retornar el valor
        //al invocante
        return this.nombres;
    }

    //Setter: sirve para asignar
    //un valor a un atributo privado 
    //Firma de un setter:
    // - Tipo de dato de retorno: void
    // - Nombre: set seguido del nombre del atributo 
    // - Parametros: 1, input del valor a asignar
    //                al atributo
    // - Retorna: nada
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
