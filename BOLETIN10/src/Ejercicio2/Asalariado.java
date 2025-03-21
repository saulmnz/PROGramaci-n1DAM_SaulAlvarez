package Ejercicio2;

import java.time.LocalDate;

public class Asalariado extends Trabajador {
    private String cargo;
    private double soldo;
    private double porcentaxeSS;
    private double porcentaxeIRPF;

    public Asalariado(String dni, String nome, LocalDate dataIngreso, String cargo,
                      double soldo, double porcentaxeSS, double porcentaxeIRPF) {
        super(dni, nome, dataIngreso);
        this.cargo = cargo;
        this.soldo = soldo;
        this.porcentaxeSS = porcentaxeSS;
        this.porcentaxeIRPF = porcentaxeIRPF;
    }

    @Override
    public double gastosIngresos() {
        return -(soldo + (soldo * 0.15));  // Gasto negativo (soldo + 15% SS)
    }

    @Override
    public String aCadea() {
        return String.format("Asalariado[DNI: %s | Cargo: %s | Soldo: %.2f€]", dni, cargo, soldo);
    }
}