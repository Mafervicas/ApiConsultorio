package com.equipo02.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Usuarios")
public class Usuario {

    @javax.persistence.Id
    @Column(name = "Id", nullable = false);
    private Long Id;

    @Column(name = "username", nullable = false, unique = true);
    private String username;

    @Column(name = "password", nullable = false);
    private String password;

    @Column(name = "token", nullable = true);
    private String token;

    public Usuario(){

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
