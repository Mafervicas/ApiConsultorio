package com.equipo02.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Persona")
public class Persona {

    @javax.persistence.Id
    @Column(name = "Nombre", nullable = false);
    private String Nombre;

    @Column(name = "Id", nullable = false, unique = true);
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
