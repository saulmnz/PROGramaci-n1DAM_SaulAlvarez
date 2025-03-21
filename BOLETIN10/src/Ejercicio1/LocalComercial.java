package Ejercicio1;

public class LocalComercial extends Inmoble {
    private int portal;
    private int piso;
    private double metros;
    private boolean acondicionado;
    private boolean fachadaRua;
    private boolean entradaMercadorias;
    private String observacions;

    public LocalComercial(String rua, int numero, String localidade, double prezo, boolean aluguer,
                          int portal, int piso, double metros, boolean acondicionado,
                          boolean fachadaRua, boolean entradaMercadorias, String observacions) {
        super(rua, numero, localidade, prezo, aluguer);
        this.portal = portal;
        this.piso = piso;
        this.metros = metros;
        this.acondicionado = acondicionado;
        this.fachadaRua = fachadaRua;
        this.entradaMercadorias = entradaMercadorias;
        this.observacions = observacions;
    }

    @Override
    public double calcularGanancia() {
        return aluguer ? prezo : prezo * 0.02;
    }

    @Override
    public String aCadea() {
        return String.format("LocalComercial[%s %d, %s | Prezo: %.2f€ | Acondicionado: %b | m²: %.2f]",
                rua, numero, localidade, prezo, acondicionado, metros);
    }
}