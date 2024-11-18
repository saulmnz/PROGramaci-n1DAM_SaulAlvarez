/**
 * Boletín 2 Ejercicio 5; Valor dunha distancia en millas mariñas e a pase a metros ( 1 milla mariña = 1852 m ).
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la distancia en millas marinas");
        double millas = scanner.nextDouble();

        double metros = millas * 1852;

        System.out.println(millas+" millas marinas son "+metros+" metros");


    }
}
