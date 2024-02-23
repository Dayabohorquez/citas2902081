package org.ptech.java.citas;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.Cita;
import org.ptech.java.citas.entities.Consultorio;
import org.ptech.java.citas.entities.Especialidad;
import org.ptech.java.citas.entities.EstadoCita;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Paciente;
import org.ptech.java.citas.entities.TipoDocumento;
import org.ptech.java.citas.entities.TipoSangre;

public class Main {
    public static void main(String[] args) {

        //crear un objeto medico
        //Instanciar un medico
        //Una manera de dar valor 
        //a atributos privados en una clase
        //es a traves de el constructor 
        //parametrizado
        Medico m = new Medico(1,
                                "Dayana" , 
                                "Bohorquez" , 
                                TipoDocumento.TI , 
                                123456789L ,
                                6735731L ,
                                Especialidad.PEDIATRIA);

        //instanciar otro medico
        Medico m2 = new Medico();
        //Se debe utilizar primero el setter
        //del atributo a asignar
        m2.setNombres("Carlos");
        m2.setApellidos("Giraldo");                        
        m2.setNumeroIdentificación(198765462L);
        m2.setTipoDocumento(TipoDocumento.CC);
        System.out.println(m2.getNombres() + " " + m2.getApellidos());

        Paciente p = new Paciente();
        p.setNombres("Juan");
        p.setApellidos("Gomez");
        p.setCelular(37486864L);
        p.setEmail("juan@gmail.com");
        p.setTipoSangre(TipoSangre.A);
        System.out.println(p.getNombres() + " " + p.getApellidos() + " " +p.getEmail() + " " + "RH:" + p.getTipoSangre());

        Consultorio c = new Consultorio();
        c.setNumero(2L);
        System.out.println(c.getNumero());

        Cita ci = new Cita();
        ci.setEstado(EstadoCita.REALIZADA);
        ci.setFecha(LocalDateTime.now());
        System.out.println("Fecha:" + ci.getFecha() + " " + "Estado" + " " + ci.getEstado() );
;    }

}