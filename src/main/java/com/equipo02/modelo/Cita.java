package com.equipo02.modelo;

public class Cita {
    private String Paciente;
    private String Doctor;
    private String Fecha;

    //Constructor
    public Cita(String paciente, String doctor, String fecha) {
        Paciente = paciente;
        Doctor = doctor;
        Fecha = fecha;
    }

    //Gets & Sets
    public String getPaciente() {
        return Paciente;
    }

    public void setPaciente(String paciente) {
        Paciente = paciente;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String doctor) {
        Doctor = doctor;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }
}
