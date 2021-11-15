package com.equipo02.modelo;

public class Administradores {
    private String Especialidad;

    //Constructor

    public Administradores(String especialidad) {
        Especialidad = especialidad;
    }

    //Gets & Sets

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }
}
