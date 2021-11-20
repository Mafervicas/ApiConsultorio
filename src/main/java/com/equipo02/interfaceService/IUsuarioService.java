package com.equipo02.interfaceService;

import com.equipo02.modelo.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {

    public List<Usuario> listar();
    public Optional<Usuario> ListarId(long Id);
    public long save(Usuario u);
    public void delete(long Id);
}
