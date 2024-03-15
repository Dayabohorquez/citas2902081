package org.ptech.java.citas.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;

public class PruebaPolimorfismo {

    public static <u1> void main(String[] args) {

        Medico u1 = new Medico(1, 
                                "Dayana", 
                                "Bohorquez", 
                                TipoDocumento.CC, 
                                23456789L,
                                345678L,
                                Especialidad.CARDIOLOGIA);

        Medico u2 = new Medico(2, 
                                "Juan", 
                                "Diaz", 
                                TipoDocumento.TI, 
                                6564354L,
                                856461L,
                                Especialidad.DERMATOLOGIA);

        Paciente u3 = new Paciente(1, 
                                    "Diego", 
                                    "Ramos", 
                                    TipoDocumento.CE, 
                                    485643514L, 
                                    "juan@gmail.com", 
                                    76461L, LocalDate.now(), 
                                    1.60, 
                                    25, 
                                    TipoSangre.A, 
                                    'P');

        Paciente u4 = new Paciente(2, 
                                    "Pedro", 
                                    "Mendoza", 
                                    TipoDocumento.CE, 
                                    825852L, 
                                    "pedro@gmail.com", 
                                    353243L, LocalDate.now(), 
                                    1.80, 
                                    30, 
                                    TipoSangre.B, 
                                    'N');

        Paciente u5 = new Paciente(3, 
                                    "Dana", 
                                    "Rodriguez", 
                                    TipoDocumento.CC, 
                                    644582L, 
                                    "dana@gmail.com", 
                                    62524L, LocalDate.now(), 
                                    1.54, 
                                    15, 
                                    TipoSangre.AB, 
                                    'P');

        Paciente u6 = new Paciente(4, 
                                    "Dayana", 
                                    "Bohorquez", 
                                    TipoDocumento.TI,
                                    1387228L, 
                                    "dayana@gmail.com", 
                                    3245245L, LocalDate.now(), 
                                    1.59, 
                                    35, 
                                    TipoSangre.O, 
                                    'N');

        Paciente u7 = new Paciente(5, 
                                    "Anyi", 
                                    "Rojas", 
                                    TipoDocumento.CC, 
                                    25482L, 
                                    "anyi@gmail.com", 
                                    8742124L, LocalDate.now(), 
                                    1.60, 
                                    31, 
                                    TipoSangre.A, 
                                    'P');

        Enfermero e8 = new Enfermero(4,
                                    "Pedro", 
                                    "Rojas", 
                                    TipoDocumento.CC, 
                                    4565143L);

        Enfermero e9 = new Enfermero(4,
                                    "David", 
                                    "Mendez", 
                                    TipoDocumento.TI, 
                                    56456456L);

        Enfermero e10 = new Enfermero(4,
                                    "Alejandro", 
                                    "Bautista", 
                                    TipoDocumento.PPT,
                                    5645645L);

        Consultorio c = new Consultorio(1, "Calle 20", 1L);

        Consultorio c1 = new Consultorio(2, "Calle 120", 2L);

        Consultorio c2 = new Consultorio(3, "Calle 200", 3L);


        CitaMedico cm = new CitaMedico(1, LocalDateTime.now(), u3, 1, EstadoCita.AGENDADA);
        e8.addProcedure("Gripe");

        CitaMedico cm2 = new CitaMedico(2, LocalDateTime.now(), u6, 2, EstadoCita.AGENDADA);
        e9.addProcedure("Escopolamina");

        System.out.println("Fecha: " + cm.getFecha() + 
                            " Consultorio: " + c.getNumero() +
                            " Nombre Medico: " + u1.getNombres() +
                            " Apellido Medico: " + u1.getApellidos());

                            System.out.println("Fecha: " + cm2.getFecha() + 
                            " Consultorio: " + c2.getNumero() +
                            " Nombre Medico: " + u2.getNombres() +
                            " Apellido Medico: " + u2.getApellidos());
        

        CitaEnfermeros ce = new CitaEnfermeros(1, LocalDateTime.now(), u6, 2, EstadoCita.AGENDADA);
        e9.addProcedure("Vacuna");
                    
        CitaEnfermeros ce2 = new CitaEnfermeros(2, LocalDateTime.now(), u7, 3, EstadoCita.AGENDADA);
        e10.addProcedure("Lavado de oidos");

        System.out.println("Fecha: " + cm.getFecha() + 
                             " Consultorio: " + c1.getNumero() +
                                " Nombre Enfermero: " + e8.getNombres() +
                                    " Apellido Enfermero: " + e8.getApellidos());

        System.out.println("Fecha: " + ce2.getFecha() + 
                            " Consultorio: " + c2.getNumero() +
                                " Nombre Enfermero: " + e9.getNombres() +
                                 " Apellido Enfermero: " + e9.getApellidos());

        cm.cancelarCita();
        System.out.println("Cita Medico id 1: " + cm.getEstado());
    }

}

