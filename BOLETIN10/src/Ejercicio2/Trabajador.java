package Ejercicio2;

import java.time.LocalDate;

public abstract class Trabajador {
    protected String dni;
    protected String nome;
    protected LocalDate dataIngreso;

    public Trabajador(String dni, String nome, LocalDate dataIngreso) {
        this.dni = dni;
        this.nome = nome;
        this.dataIngreso = dataIngreso;
    }

    public abstract double gastosIngresos();
    public abstract String aCadea();
}