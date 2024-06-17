package com.example.crudconsola.repositories;

import com.example.crudconsola.entities.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends CrudRepository<Cliente,Integer> {


    @Query("select count(c) from Cliente c")
    Integer getTotalCliente();

    @Query("select c from Cliente c where c.idCliente=(select max(c.idCliente) from Cliente c)")
    Optional<Cliente> getLastRegistration();
    //me filtre a clientes por el sexo y por el identificador de documento en orden ascedente
    List<Cliente> findBySexoClienteOrderByIdentificadorDocumentoAsc(Integer sexo);
    //List<Cliente> findBySexoClienteOrderByIdentificadorDocumentoAsc(Integer sexo);
    /*
          SQL_nativo = "select *
          from cliente
          where sexo = 2
          order by identicador_documento asc"

    *
     */
}
