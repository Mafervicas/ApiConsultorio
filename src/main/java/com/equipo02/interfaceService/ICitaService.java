package com.equipo02.interfaceService;

import com.equipo02.modelo.Cita;

import java.util.List;
import java.util.Optional;

public interface ICitaService {

    public List<Cita> listar();
    public Optional<Cita> ListarId(long Id);
    public long save(Cita u);
    public void delete(long Id);
}
