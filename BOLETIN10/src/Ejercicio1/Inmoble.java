package Ejercicio1;

public abstract class Inmoble {
    protected String rua;
    protected int numero;
    protected String localidade;
    protected double prezo;
    protected boolean aluguer;

    public Inmoble(String rua, int numero, String localidade, double prezo, boolean aluguer) {
        this.rua = rua;
        this.numero = numero;
        this.localidade = localidade;
        this.prezo = prezo;
        this.aluguer = aluguer;
    }

    public abstract double calcularGanancia();
    public abstract String aCadea();
}
