package com.example.crudconsola.repositories;

import com.example.crudconsola.entities.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente,Integer> {

}
