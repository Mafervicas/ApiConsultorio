package com.equipo02.modelo;

public class Paciente {

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
