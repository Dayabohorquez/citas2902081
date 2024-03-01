package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;

//Clases que heredan:
//-Claseshijas
//-subclases
//-Clases detalle
//-Clases especificas

public class Medico extends Usuario{

    //POR REGLA GENERAL:
    //Los atribustos de una clase 
    //deben ser private
    private Long registroMedico; 
    private Especialidad especialidad;


    public Medico(int id, 
                    String nombres, 
                    String apellidos, 
                    TipoDocumento tipoDocumento, 
                    Long numeroIdentificación) {

    //Si quieres instanciar un medico
    //Tambien debes instanciar el usuario
    //super en el constructuctor invoca(llama, ejecuta)
    //al constructor de la clase padre(Super Clase)
    //debe ser lo primero que aperezca en el 
    //constructor de la clase hija 
        super(id, nombres, apellidos, tipoDocumento, numeroIdentificación);
    //a continuaction inicializamos
    //atributos propios de la clase hija
    }


    public Medico(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroIdentificación,
            Long registroMedico, Especialidad especialidad) {
        super(id, nombres, apellidos, tipoDocumento, numeroIdentificación);
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }


    public Long getRegistroMedico() {
        return registroMedico;
    }


    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }


    public Especialidad getEspecialidad() {
        return especialidad;
    }


    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    

}