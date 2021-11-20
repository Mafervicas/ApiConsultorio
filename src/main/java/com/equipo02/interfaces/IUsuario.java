package com.equipo02.interfaces;

import com.equipo02.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuario extends CrudRepository<Usuario, Long> {
}
