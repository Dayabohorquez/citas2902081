package org.ptech.java.citas.entities;

import java.time.LocalDate;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;

public class PruebaPolimorfismo {

    public static void main(String[] args) {
        //instanciar un usuario
        Usuario  u = new Usuario(1, 
                                "Anyi", 
                                "Rojas", 
                                TipoDocumento.CC, 
                                23456789L);
        System.out.println(u.toString());

        Usuario u1 = new Medico(3, 
                                "Dayana", 
                                "Bohorquez", 
                                TipoDocumento.CC, 
                                23456789L,
                                345678L,
                                Especialidad.CARDIOLOGIA);
        System.out.println(u1.toString());

        Usuario u2 = new Paciente(2, 
                                    "Juan", 
                                    "Ramos", 
                                    TipoDocumento.CC, 
                                    86180432L, 
                                    "juan@gmail.com", 
                                    76461L, LocalDate.now(), 
                                    1.60, 
                                    25, 
                                    TipoSangre.A, 
                                    'P');

        System.out.println(u2.toString());

        Usuario u3 = new Enfermero(4, 
                                "Pablo", 
                                "Ruiz", 
                                TipoDocumento.CC, 
                                7654225L);

        System.out.println(u3.toString());
    }
}

