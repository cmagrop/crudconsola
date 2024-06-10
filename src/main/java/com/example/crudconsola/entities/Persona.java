package com.example.crudconsola.entities;

import jakarta.persistence.*;
//Creacion de una entidad = tabla llamada personas
@Entity
@Table(name="personas")
public class Persona
{
    //creacion de id, PK autoincrementable
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //creacion de campo nombre
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido1;
    @Column(nullable = false)
    private String apellido2;
    //lenguaje_programacion
    @Column(name = "lenguaje_programacion",nullable = false)
    private String lenguajeProgramacion;

    public Persona()
    {

    }

    public Persona(Integer id, String nombre, String apellido1, String apellido2, String lenguajeProgramacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", lenguajeProgramacion='" + lenguajeProgramacion + '\'' +
                '}';
    }
}

