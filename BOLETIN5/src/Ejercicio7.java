import java.util.Scanner;

/**
 * Boletín 5 Ejercicio 7;  Solicita o usuario un número n e debuxa un triángulo de base e altura n.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el número de la altura y base del triángulo");
        int n = entrada.nextInt();
        int asteriscos = 1;

        while (n!=0) {
            System.out.println(" ".repeat(n+2)+" *".repeat(asteriscos));
            n--;
            asteriscos++;
        }
    }
}
