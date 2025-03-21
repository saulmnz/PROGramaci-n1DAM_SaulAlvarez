package Ejercicio2;

import java.time.LocalDate;

public class Socio {
    private String dni;
    private String nome;
    private String direccion;
    private String provincia;
    private LocalDate dataAlta;
    private double cuota;

    public Socio(String dni, String nome, String direccion, String provincia,
                 LocalDate dataAlta, double cuota) {
        this.dni = dni;
        this.nome = nome;
        this.direccion = direccion;
        this.provincia = provincia;
        this.dataAlta = dataAlta;
        this.cuota = cuota;
    }

    public double gastosIngresos() {
        return cuota;  // Ingreso positivo
    }

    public String aCadea() {
        return String.format("Socio[DNI: %s | Nome: %s | Cuota: %.2f€]", dni, nome, cuota);
    }
}
