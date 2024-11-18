import java.util.Scanner;

/**
 * Boletín 3 Ejercicio 1; Codifica un programa que solicite un número por teclado e que saque un mensaxe que diga “É un número positivo”, sempre que cumpra esa condición.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número");
        int n1 = scanner.nextInt();

        if (n1>0){
            System.out.println("Es un número positivo");
        }
    }
}
