package com.example.crudconsola.controllers;

import com.example.crudconsola.entities.Cliente;
import com.example.crudconsola.services.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public List<Cliente> list()
    {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> view(@PathVariable Integer id)
    {
        Optional<Cliente> clienteOptional = service.findById(id);
        if(clienteOptional.isPresent())
         //true
        {
            return ResponseEntity.ok(clienteOptional.orElseThrow());
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody Cliente cliente, BindingResult result)
    {




    }

}
