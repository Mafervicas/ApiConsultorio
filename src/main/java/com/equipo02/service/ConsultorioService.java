package com.equipo02.service;

import com.equipo02.interfaceService.IConsultorioService;
import com.equipo02.interfaces.IConsultorio;
import com.equipo02.modelo.Consultorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ConsultorioService implements IConsultorioService{
    
    @Autowired
    private IConsultorio data;


    @Override
    public List<Consultorio> listar() {
        return (List<Consultorio>) data.findAll();
    }

    @Override
    public Optional<Consultorio> ListarId(long Id) {
        return Optional.empty();
    }

    @Override
    public long save(Consultorio u) {
        return 0;
    }

    @Override
    public void delete(long Id) {

    }
}
