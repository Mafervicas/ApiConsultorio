package com.equipo02.controller;


import com.equipo02.interfaceService.IUsuarioService;
import com.equipo02.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private IUsuarioService serviceUsuario;


    @GetMapping("/listar")
    public String listar (Model model){
        List<Usuario> usuarios = serviceUsuario.listar();
        model.addAttribute("usuarios", usuarios);
        return "index";
    }
}
