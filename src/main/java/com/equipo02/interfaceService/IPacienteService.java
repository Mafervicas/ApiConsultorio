package com.equipo02.interfaceService;

import com.equipo02.modelo.Doctores;
import com.equipo02.modelo.Paciente;

import java.util.List;
import java.util.Optional;

public interface IPacienteService {
    public List<Paciente> listar();
    public Optional<Paciente> ListarId(long Id);
    public long save(Paciente u);
    public void delete(long Id);
}
