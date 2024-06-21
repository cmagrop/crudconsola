package com.example.crudconsola.repositories;

import com.example.crudconsola.models.ResultadoReserva;
import com.example.crudconsola.entities.Reserva;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReservaRepository extends CrudRepository<Reserva,Integer> {

    //Lista de todos los clientes que tienen reserva y profesionales que le atienden
    @Query(value = "SELECT concat(cliente.nombre_cliente,\" \",cliente.apellido1_cliente,\" \",cliente.apellido2_cliente) as CLIENTE, concat(profesional.nombre_profesional,\" \",profesional.apellido1_profesional,\" \",profesional.apellido2_profesional) AS PROFESIONAL, reserva.fecha_reserva as FECHA \n" +
            "from reserva \n" +
            "INNER JOIN cliente ON reserva.id_cliente=cliente.id_cliente\n" +
            "INNER JOIN profesional ON reserva.id_profesional= profesional.id_profesional and \n" +
            "reserva.baja_reserva=1;", nativeQuery = true)
    List<ResultadoReserva> listaClientesProfesionalesReservas();

    //Filtrar a cliente por id y listar sus reservas con profesional

    //Filtrar a profesionales por id y listar a clientes con reserva

    //Listado de los profesionales agrupados por apellido1 y ordenado por cantidad de atenciones7



}
