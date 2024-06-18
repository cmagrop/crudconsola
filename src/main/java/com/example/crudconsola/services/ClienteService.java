package com.example.crudconsola.services;

import com.example.crudconsola.entities.Cliente;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    List<Cliente> findAll(); //listar todos los clientes

    Optional<Cliente> findById(Integer id); //me va mostrar un cliente por id

    Cliente save(Cliente cliente); //guardará a un cliente

    Optional<Cliente> update(Integer id,Cliente cliente);

    Optional<Cliente> delete(Integer id);

}
