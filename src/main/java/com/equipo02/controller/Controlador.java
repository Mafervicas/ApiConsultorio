package com.equipo02.controller;


import com.equipo02.interfaceService.*;
import com.equipo02.modelo.*;
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
        return "index";}


        //---------------Paciente-------------------------

        @Autowired
        private IPacienteService servicePaciente;


        @GetMapping("/listar")
        public String listarPaciente (Model model) {
            List<Paciente> pacientes = servicePaciente.listar();
            model.addAttribute("Paciente", pacientes);
            return "index";

    }

}
