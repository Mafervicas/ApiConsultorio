package com.equipo02.service;

import com.equipo02.interfaceService.IDoctoresService;
import com.equipo02.interfaces.IDoctores;
import com.equipo02.modelo.Doctores;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

public class DoctoresService implements IDoctoresService {
    @Autowired
    private IDoctores data;


    @Override
    public List<Doctores> listar() {
        return (List<Doctores>) data.findAll();
    }

    @Override
    public Optional<Doctores> ListarId(long Id) {
        return Optional.empty();
    }

    @Override
    public long save(Doctores u) {
        return 0;
    }

    @Override
    public void delete(long Id) {

    }
}
