package com.example.crudconsola;

import java.time.LocalDate;

public class ResultadoReserva {
    String cliente;
    String profesional;
    LocalDate fecha;

    @Override
    public String toString() {
        return "ResultadoReserva{" +
                "cliente='" + cliente + '\'' +
                ", profesional='" + profesional + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
