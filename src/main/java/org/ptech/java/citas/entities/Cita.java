package org.ptech.java.citas.entities;
import java.time.LocalDateTime;

import org.ptech.java.citas.entities.enums.EstadoCita;

public class Cita {
    int id;
    LocalDateTime fecha;
    Consultorio consultorio;
    Paciente paciente;
    

    @Override
    public String toString() {
        return "Cita [id=" + 
                        id + 
                        ", fecha=" + 
                        fecha + 
                        ", consultorio=" + 
                        consultorio  + "]";
                
    }

    //constructor parametrizado
    public Cita(int id, LocalDateTime fecha, Paciente paciente2, int i) {
        this.id = id;
        this.fecha = fecha;
        this.consultorio = consultorio;
        this.paciente = paciente;
    }

    //Ecncapsulados getter y setter
    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
}





