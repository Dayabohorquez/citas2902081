package org.ptech.java.citas.entities;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.Interfaces.IAgendable;
import org.ptech.java.citas.entities.enums.EstadoCita;

public class CitaEnfermeros extends Cita implements IAgendable {

    private Enfermero enfermero;
    private EstadoCita estado;

    public CitaEnfermeros(int id, LocalDateTime fecha, Paciente paciente2, Consultorio consultorio) {
        super(id, fecha, paciente2, consultorio);
    }

    public Enfermero getEnfermero() {
        return enfermero;
    }



    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }



    public EstadoCita getEstado() {
        return estado;
    }



    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }



    @Override
    public boolean agendarCita(LocalDateTime fecha, Consultorio c) {
        this.setFecha(fecha);
        this.setConsultorio(c);
        return true;
    }

    @Override
    public boolean reAgendarCita(LocalDateTime nuevaFecha, Consultorio nuevoc) {
        this.setFecha(nuevaFecha);
        this.setConsultorio(nuevoc);
        return true;
    }

    @Override
    public boolean cancelarCita() {
        this.estado = EstadoCita.CANCELADA;
        return true;
    }
    
}
