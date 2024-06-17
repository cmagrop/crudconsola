package com.example.crudconsola.services;

import com.example.crudconsola.entities.Cliente;

import java.util.List;
import java.util.Optional;

public class ClienteServiceImpl implements ClienteService{
    @Override
    public List<Cliente> findAll() {
        return List.of();
    }

    @Override
    public Optional<Cliente> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Cliente save(Cliente cliente) {
        return null;
    }

    @Override
    public Optional<Cliente> update(Integer id, Cliente cliente) {
        return Optional.empty();
    }

    @Override
    public Optional<Cliente> delete(Integer id) {
        return Optional.empty();
    }
}
