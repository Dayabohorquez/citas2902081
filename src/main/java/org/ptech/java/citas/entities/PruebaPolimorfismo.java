package org.ptech.java.citas.entities;

import java.time.LocalDate;
import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;

public class PruebaPolimorfismo {

    public static <u1> void main(String[] args) {

        Usuario u1 = new Medico(3, 
                                "Dayana", 
                                "Bohorquez", 
                                TipoDocumento.CC, 
                                23456789L,
                                345678L,
                                Especialidad.CARDIOLOGIA);
        System.out.println(" Nombre del medico: " + u1.getNombres() +
                             " Apellidos del medico: " + u1.getApellidos() +
                              " Especialidad del medico: " + u1.getEspecialidad());

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

        System.out.println(" Nombre del paciente: " + u2.getNombres() + 
                            " Apellidos del paciente: " + u2.getApellidos() +
                             " email del paciente: " + u2.getEmail() + 
                             " Tipo de sangre: " + u2.getTipoSangre() + 
                             " Factor RH: " + u2.getFactorRH() + 
                             " Altura paciente: " + u2.getAltura() + 
                             " Peso paciente: " + u2.getPeso());


    }
}

