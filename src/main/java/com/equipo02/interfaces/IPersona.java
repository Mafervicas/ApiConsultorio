package com.equipo02.interfaces;

import com.equipo02.modelo.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersona  extends CrudRepository<Persona, Long> {

}
