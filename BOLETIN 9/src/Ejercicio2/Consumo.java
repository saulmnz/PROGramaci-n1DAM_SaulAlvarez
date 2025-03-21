package Ejercicio2;

public class Consumo {
    private double km;
    private double litros;
    private double vMed;
    private double pGas;

    public Consumo() {
        km = 0;
        litros = 0;
        vMed = 0;
        pGas = 0;
    }

    public Consumo(double km, double litros, double vMed, double pGas) {
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }

    public double getTempo() {
        return (vMed != 0) ? km / vMed : 0;
    }

    public double consumoMedio() {
        return (km != 0) ? (litros / km) * 100 : 0;
    }

    public double consumoEuros() {
        return consumoMedio() * pGas;
    }

    public double getKm() { return km; }
    public void setKms(double km) { this.km = km; }

    public double getLitros() { return litros; }
    public void setLitros(double litros) { this.litros = litros; }

    public double getVMed() { return vMed; }
    public void setVMed(double vMed) { this.vMed = vMed; }

    public double getPGas() { return pGas; }
    public void setPGas(double pGas) { this.pGas = pGas; }
}
