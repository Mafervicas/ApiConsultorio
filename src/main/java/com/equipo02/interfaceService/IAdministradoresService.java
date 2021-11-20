package com.equipo02.interfaceService;

import com.equipo02.modelo.Administradores;

import java.util.List;
import java.util.Optional;

public interface IAdministradoresService {

    public List<Administradores> listar();
    public Optional<Administradores> ListarId(long Id);
    public long save(Administradores u);
    public void delete(long Id);
    
}
