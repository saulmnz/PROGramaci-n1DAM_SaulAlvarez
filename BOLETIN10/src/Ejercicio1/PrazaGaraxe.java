package Ejercicio1;

public class PrazaGaraxe extends Inmoble {
    private double ancho;
    private double longo;
    private int numPraza;
    private boolean adega;
    private boolean trasteiro;

    public PrazaGaraxe(String rua, int numero, String localidade, double prezo, boolean aluguer,
                       double ancho, double longo, int numPraza, boolean adega, boolean trasteiro) {
        super(rua, numero, localidade, prezo, aluguer);
        this.ancho = ancho;
        this.longo = longo;
        this.numPraza = numPraza;
        this.adega = adega;
        this.trasteiro = trasteiro;
    }

    @Override
    public double calcularGanancia() {
        return aluguer ? prezo : prezo * 0.03;
    }

    @Override
    public String aCadea() {
        return String.format("PrazaGaraxe[%s %d, %s | Prezo: %.2f€ | Aluguer: %b | Adega: %b | Trasteiro: %b]",
                rua, numero, localidade, prezo, aluguer, adega, trasteiro);
    }
}