package com.equipo02.interfaces;

import com.equipo02.modelo.Cita;
import org.springframework.data.repository.CrudRepository;

public interface ICita extends CrudRepository<Cita, Long> {
}
