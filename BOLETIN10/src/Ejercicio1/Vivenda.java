package Ejercicio1;
public class Vivenda extends Inmoble {
    private int portal;
    private int piso;
    private int habitacions;
    private boolean prazaGaraxe;
    private boolean trasteiro;
    private boolean adega;
    private String observacions;

    public Vivenda(String rua, int numero, String localidade, double prezo, boolean aluguer,
                   int portal, int piso, int habitacions, boolean prazaGaraxe,
                   boolean trasteiro, boolean adega, String observacions) {
        super(rua, numero, localidade, prezo, aluguer);
        this.portal = portal;
        this.piso = piso;
        this.habitacions = habitacions;
        this.prazaGaraxe = prazaGaraxe;
        this.trasteiro = trasteiro;
        this.adega = adega;
        this.observacions = observacions;
    }

    @Override
    public double calcularGanancia() {
        return aluguer ? prezo : prezo * 0.02;
    }

    @Override
    public String aCadea() {
        return String.format("Vivenda[%s %d, %s | Habitacions: %d | Prezo: %.2f€ | Garaxe: %b]",
                rua, numero, localidade, habitacions, prezo, prazaGaraxe);
    }
}