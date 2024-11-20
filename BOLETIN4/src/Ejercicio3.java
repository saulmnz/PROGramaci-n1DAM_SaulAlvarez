import java.util.Scanner;
/**
 * Boletín 4 Ejercicio 3; Utiliza o operador ternario para calcular o valor absoluto dun número que se solicita o usuario por teclado.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nuuuuuumeritoooooo ");
        double n = scanner.nextDouble();

        double valorabs = (n < 0) ? -n : n;

        System.out.println("Valor absoluto de " + n + " es " + valorabs);

    }
}
