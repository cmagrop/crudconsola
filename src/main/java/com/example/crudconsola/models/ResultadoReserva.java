package com.example.crudconsola.models;

import java.time.LocalDate;

public interface ResultadoReserva {
    String getCliente();
    String getProfesional();
    LocalDate getFecha();
}
