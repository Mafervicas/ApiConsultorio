package com.equipo02.interfaceService;

import com.equipo02.modelo.Doctores;
import com.equipo02.modelo.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {

    public List<Persona> listar();
    public Optional<Persona> ListarId(long Id);
    public long save(Persona u);
    public void delete(long Id);
}
