package com.equipo02.controller;


import com.equipo02.interfaceService.IAdministradoresService;
import com.equipo02.interfaceService.ICitaService;
import com.equipo02.interfaceService.IConsultorioService;
import com.equipo02.interfaceService.IDoctoresService;
import com.equipo02.interfaceService.IUsuarioService;
import com.equipo02.modelo.Administradores;
import com.equipo02.modelo.Cita;
import com.equipo02.modelo.Consultorio;
import com.equipo02.modelo.Doctores;
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

    @Autowired
    private IAdministradoresService serviceAdministradores;


    @GetMapping("/listar")
    public String listarAdministradores (Model model) {
        List<Administradores> administradores = serviceAdministradores.listar();
        model.addAttribute("Administradores", administradores);
        return "index";

    }

    @Autowired
    private IConsultorioService serviceConsultorio;


    @GetMapping("/listar")
    public String listarConsultorio (Model model) {
        List<Consultorio> consultorio = serviceConsultorio.listar();
        model.addAttribute("Consultorio", consultorio);
        return "index";

    }

}