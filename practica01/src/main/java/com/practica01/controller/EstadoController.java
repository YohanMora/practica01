/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.practica01.controller;

import com.practica01.domain.Estado;
import com.practica01.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Yohan Alvarado
 */
@Controller
public class EstadoController {
    @Autowired
    private EstadoService estadoService;
    
    @RequestMapping("/")
    public String page(Model model) {
        
        var listEstados = estadoService.getEstados();
        model.addAttribute("listEstados", listEstados);
        return "index";
    }
    @GetMapping("/nuevoEstado")
    public String nuevoEstado(Estado Estado) {
        
        return "modificarEstado";
    }
    
    @PostMapping("/saveEstado")
    public String saveEstado(Estado estado){
        estadoService.saveEstado(estado);
        return "redirect:/";
    }
    
    @GetMapping("/updateEstado/{idEstado}")
    public String updateEstado(Estado estado, Model model){
        
        var modelEstado = estadoService.getEstado(estado);
        
        model.addAttribute("modelEstado",modelEstado);

        return "modificarEstado";
    }
    
    @GetMapping("/deleteEstado/{idEstado}")
    public String deleteEstado(Estado estado) {
        
        estadoService.deleteEstado(estado);
        
        return "redirect:/";
    }
}
