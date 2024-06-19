package com.example.crudconsola.controllers;

import com.example.crudconsola.entities.Cliente;
import com.example.crudconsola.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping("/lista-clientes")
    public String listaClientes(ModelMap model)
    {
      model.addAttribute("title","Lista de Clientes");
      return "lista-clientes";

    }

    @ModelAttribute("clientes")
    public List<Cliente> clientesModel()
    {
        List<Cliente> clientes = service.findAll();
        return  clientes;

    }

}
