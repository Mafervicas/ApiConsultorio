package com.equipo02.modelo;

public class Doctores {
    private String Paciente;
    private String Especialidad;
    private String Contrasena;

    //Constructor

    public Doctores(String paciente, String especialidad, String contrasena) {
        Paciente = paciente;
        Especialidad = especialidad;
        Contrasena = contrasena;
    }

    //Gets & Sets

    public String getPaciente() {
        return Paciente;
    }

    public void setPaciente(String paciente) {
        Paciente = paciente;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }
}
