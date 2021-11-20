package com.equipo02.service;

import com.equipo02.interfaceService.ICitaService;
import com.equipo02.interfaces.ICita;
import com.equipo02.modelo.Cita;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CitaService implements ICitaService {

    @Autowired
    private ICita data;


    @Override
    public List<Cita> listar() {
        return (List<Cita>) data.findAll();
    }

    @Override
    public Optional<Cita> ListarId(long Id) {
        return Optional.empty();
    }

    @Override
    public long save(Cita u) {
        return 0;
    }

    @Override
    public void delete(long Id) {

    }
}
