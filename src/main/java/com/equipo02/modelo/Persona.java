package com.equipo02.modelo;

public class Persona {

    private String Nombre;
    private String id;

    //Constructor

    public Persona(String nombre, String id) {
        Nombre = nombre;
        this.id = id;
    }

    //Gets & Sets

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
