package com.example.crudconsola.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "profesional")
public class Profesional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_profesional;

    @Column(name = "password_profesional", nullable = false, columnDefinition = "varchar",length = 12)
    private String passwordProfesional;
    @Column(name = "nombre_profesional", nullable = false, columnDefinition = "varchar(20)")
    private String nombreProfesional;
    @Column(name = "apellido1_profesional", nullable = false,columnDefinition = "varchar(25)")
    private String apellido1Profesional;
    @Column(name = "apellido2_profesional", nullable = false,columnDefinition = "varchar(25)")
    private String apellido2Profesional;
    @Column(name = "nacionalidad_profesional", nullable = false, columnDefinition = "varchar(50)")
    private String nacionalidadProfesional;
    @Column(name = "fnac_profesional", nullable = false,columnDefinition = "date")
    private Date fnacProfesional;
    @Column(name = "sexo_profesional", nullable = false, columnDefinition = "int")
    private Integer sexoProfesional;
    @Column(name = "direccion_profesional", nullable = false, columnDefinition = "varchar(50)" )
    private String direccionProfesional;
    @Column(name = "comuna_profesional", nullable = false, columnDefinition = "varchar(25)")
    private String comunaProfesional;
    @Column(name = "email_profesional", nullable = false, columnDefinition = "varchar(50)")
    private String emailProfesional;
    @Column(name = "telefono_profesional", nullable = false, columnDefinition = "varchar(25)")
    private String telefonoProfesional;



}
