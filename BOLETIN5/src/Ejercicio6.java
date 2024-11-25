import java.util.Scanner;

/**
 * Boletín 5 Ejercicio 6; Realizar o programa que pida un número e como resultado nos de o factorial no número (n!).
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame el numerito: ");
        int n = entrada.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n; i++){
            factorial *= i;
        }

        System.out.println("El resultado factorial de "+n+"! es = "+ factorial);
    }
}
