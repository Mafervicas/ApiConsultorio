package com.equipo02.modelo;

public class Consultorio {
    private String Paciente;
    private String Doctor;
    private String Fecha;
    private String Hora;

    //Constructor


    public Consultorio(String paciente, String doctor, String fecha, String hora) {
        Paciente = paciente;
        Doctor = doctor;
        Fecha = fecha;
        Hora = hora;
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

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }
}
