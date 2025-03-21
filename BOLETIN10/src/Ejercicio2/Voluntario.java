package Ejercicio2;

import java.time.LocalDate;

public class Voluntario extends Trabajador {
    private int idade;
    private String profesion;
    private int horas;

    public Voluntario(String dni, String nome, LocalDate dataIngreso,
                      int idade, String profesion, int horas) {
        super(dni, nome, dataIngreso);
        this.idade = idade;
        this.profesion = profesion;
        this.horas = horas;
    }

    @Override
    public double gastosIngresos() {
        return -3;  // Gasto fixo de 3€/mes
    }

    @Override
    public String aCadea() {
        return String.format("Voluntario[DNI: %s | Profesion: %s | Horas: %d]", dni, profesion, horas);
    }
}
