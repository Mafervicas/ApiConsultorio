package com.equipo02.service;

import com.equipo02.interfaceService.IAdministradoresService;
import com.equipo02.interfaces.IAdministradores;
import com.equipo02.modelo.Administradores;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


public class AdministradoresService implements IAdministradoresService {

    @Autowired
    private IAdministradores data;


    @Override
    public List<Administradores> listar() {
        return (List<Administradores>) data.findAll();
    }

    @Override
    public Optional<Administradores> ListarId(long Id) {
        return Optional.empty();
    }

    @Override
    public long save(Administradores u) {
        return 0;
    }

    @Override
    public void delete(long Id) {

    }
    
}
