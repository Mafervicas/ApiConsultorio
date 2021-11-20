package com.equipo02.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Paciente")
public class Paciente {

    @javax.persistence.Id
    @Column(name = "HistorialClinico", nullable = false);
    private String HistorialClinico;

    //Constructor

    public Paciente(String historialClinico) {
        HistorialClinico = historialClinico;
    }

    //Gets & Sets

    public String getHistorialClinico() {
        return HistorialClinico;
    }

    public void setHistorialClinico(String historialClinico) {
        HistorialClinico = historialClinico;
    }
}
