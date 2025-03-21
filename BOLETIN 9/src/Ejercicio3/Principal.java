package Ejercicio3;

public class Principal {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.acelerar(50);
        System.out.println("Velocidade: " + coche.getVelocidade());
        coche.frenar(30);
        System.out.println("Velocidade: " + coche.getVelocidade());
    }
}