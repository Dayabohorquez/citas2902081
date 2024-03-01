package org.ptech.java.citas;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.Enfermero;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Usuario;
import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;

public class Main {
    public static void main(String[] args) { 
        
        //Crear un medico 
        Medico m1 = new Medico(1, 
                        "Anyi", 
                        "Mendivelso", 
                        TipoDocumento.CC, 
                        4563585L,
                        45678998L,
                        Especialidad.CARDIOLOGIA);
        System.out.println("id del medico: " + m1.getId() + " Nombre del medico: " + m1.getNombres() + " Apellidos del medico: " + m1.getApellidos() + " Especialidad del medico: " + m1.getEspecialidad());

        //crear un enfermero:
        Enfermero e1 = new Enfermero(1, 
                                    "Camila", 
                                    "Rojas", 
                                    TipoDocumento.CE, 
                                    234567890L);
        //añadir dos procedimientos a la enfermera
        e1.addProcedure("Aplicar inyecciones");
        e1.addProcedure("Lavado de oidos");

        //recorrer los procedimientos de e1
        for( String p : e1.getProcedimientos()){
            System.out.println("Procedimientos: " + p);
        }
    }

}