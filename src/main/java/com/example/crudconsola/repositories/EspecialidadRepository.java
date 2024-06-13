package com.example.crudconsola.repositories;

import com.example.crudconsola.entities.Especialidad;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EspecialidadRepository extends
        CrudRepository<Especialidad,Integer> {
    //select * from especilidad
    @Query("select e from Especialidad e")
    public List<Especialidad> getEspecialidades(); //listando especialidades

    //select * from especialidad where id_especialidad = 5

    @Query("select esp from Especialidad esp where esp.id_especialidad in ?1 ")
    public Optional<Especialidad> getEspecialidadPorId(Integer id);



}
