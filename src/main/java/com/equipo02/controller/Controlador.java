package com.equipo02.controller;


import com.equipo02.interfaceService.ICitaService;
import com.equipo02.interfaceService.IDoctoresService;
import com.equipo02.interfaceService.IPersonaService;
import com.equipo02.interfaceService.IUsuarioService;
import com.equipo02.modelo.Cita;
import com.equipo02.modelo.Doctores;
import com.equipo02.modelo.Persona;
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
    //Usuarios
    @Autowired
    private IUsuarioService serviceUsuario;


    @GetMapping("/listar")
    public String listarUsuario (Model model){
        List<Usuario> usuarios = serviceUsuario.listar();
        model.addAttribute("usuarios", usuarios);
        return "index";
    }
        //---------------Cita-------------------------

        @Autowired
        private ICitaService serviceCita;


        @GetMapping("/listar")
        public String listarCita (Model model) {
            List<Cita> Cita = serviceCita.listar();
            model.addAttribute("Cita", Cita);
            return "index";

        }

    //---------------Doctores-------------------------

    @Autowired
    private IDoctoresService serviceDoctores;


    @GetMapping("/listar")
    public String listarDoctores (Model model) {
        List<Doctores> doctores = serviceDoctores.listar();
        model.addAttribute("Doctores", doctores);
        return "index";

    }

    //---------------Persona-------------------------

    @Autowired
    private IPersonaService servicePersona;


    @GetMapping("/listar")
    public String listarPersona (Model model) {
        List<Persona> personas = servicePersona.listar();
        model.addAttribute("Persona", personas);
        return "index";

    }

}
