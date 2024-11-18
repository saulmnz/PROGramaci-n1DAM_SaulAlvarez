/**
 * Boletín 2 Ejercicio 2; Programa que calcule el area de un cuadrado
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */

import java.util.Scanner;
import java.util.Locale;
public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce euros a cambiar ( Los decimales con comas )");
        double euros = scanner.nextDouble();

        System.out.println("Introduce valor actual de cambio a dolar  ( Los decimales con comas ) ");
        double cambio = scanner.nextDouble();

        double dolar = cambio * euros;

        System.out.println(euros + " euros son " + dolar + " dolares" );

    }
}
