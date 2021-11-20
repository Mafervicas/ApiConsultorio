package com.equipo02.interfaces;

import com.equipo02.modelo.Consultorio;
import org.springframework.data.repository.CrudRepository;

public interface IConsultorio extends CrudRepository<Consultorio, Long> {
    
}
