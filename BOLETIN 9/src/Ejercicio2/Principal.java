package Ejercicio2;

public class Principal {
    public static void main(String[] args) {
        Consumo consumo1 = new Consumo();
        consumo1.setLitros(50);
        consumo1.setPGas(1.57);

        Consumo consumo2 = new Consumo(300, 25, 80, 1.60);
        System.out.println("Consumo medio: " + consumo2.consumoMedio() + " l/100km");

        consumo2.setLitros(30);
        System.out.println("Velocidade media: " + consumo2.getVMed() + " km/h");
    }
}
