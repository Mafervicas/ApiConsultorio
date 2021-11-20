package com.equipo02.interfaceService;

import com.equipo02.modelo.Consultorio;

import java.util.List;
import java.util.Optional;

public interface IConsultorioService {
    
    public List<Consultorio> listar();
    public Optional<Consultorio> ListarId(long Id);
    public long save(Consultorio u);
    public void delete(long Id);

}
