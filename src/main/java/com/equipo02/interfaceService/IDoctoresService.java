package com.equipo02.interfaceService;

import com.equipo02.modelo.Doctores;

import java.util.List;
import java.util.Optional;

public interface IDoctoresService {
    public List<Doctores> listar();
    public Optional<Doctores> ListarId(long Id);
    public long save(Doctores u);
    public void delete(long Id);
}
