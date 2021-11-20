package com.equipo02.interfaces;

import com.equipo02.modelo.Administradores;
import org.springframework.data.repository.CrudRepository;

public interface IAdministradores extends CrudRepository<Administradores, Long> {
    
}
