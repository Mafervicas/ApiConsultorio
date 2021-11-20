package com.equipo02.interfaces;

import com.equipo02.modelo.Paciente;
import org.springframework.data.repository.CrudRepository;

public interface IPaciente  extends CrudRepository<Paciente, Long> {
}
