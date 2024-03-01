package org.ptech.java.citas.entities;

import java.util.ArrayList;
import java.util.List;
import org.ptech.java.citas.entities.enums.TipoDocumento;

public class Enfermero extends Usuario {

    private List<String> procedimientos;

    public Enfermero(int id, 
                    String nombres, 
                    String apellidos, 
                    TipoDocumento tipoDocumento, 
                    Long numeroIdentificación) {
        //1. llamar al constructor de 
        //la superclase
        super(id, nombres, 
                apellidos, tipoDocumento, 
                    numeroIdentificación);
        //2. inicializar atributos
        //intrinsecos del objeto
        this.procedimientos = new ArrayList<String>();
        
    }

    public void addProcedure(String procedure) {
        //añadir el procedimiento a 
        //la lista de procedimiento
        this.procedimientos.add(procedure);
    }

    public List<String> getProcedimientos() {
        return procedimientos;
    }


    

}
