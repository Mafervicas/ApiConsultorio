package com.equipo02.service;

import com.equipo02.interfaceService.IUsuarioService;
import com.equipo02.interfaces.IUsuario;
import com.equipo02.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UsuarioService implements IUsuarioService {

    @Autowired
    private IUsuario data;


    @Override
    public List<Usuario> listar() {
        return (List<Usuario>) data.findAll();
    }

    @Override
    public Optional<Usuario> ListarId(long Id) {
        return Optional.empty();
    }

    @Override
    public long save(Usuario u) {
        return 0;
    }

    @Override
    public void delete(long Id) {

    }
}
