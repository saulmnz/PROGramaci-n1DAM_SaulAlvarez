import java.util.Scanner;

/**
 * Boletín 3 Ejercicio 4; Nome e o peso de dúas persoas, o programa escribirá por consola os datos da persoa que pesa máis e a diferenza de peso entre elas.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre de la primera persona");
        String n1 = scanner.next();

        System.out.println("Introduce el peso de la primera persona");
        double p1 = scanner.nextDouble();

        System.out.println("Introduce el nombre de la primera persona");
        String n2 = scanner.next();

        System.out.println("Introduce el peso de la segunda persona");
        double p2 = scanner.nextDouble();

        if (p1>p2){

            double resta = p1 - p2;
            System.out.println(n1 + " pesa más que " + n2 + " con una diferencia de "+ resta);

        } else if (p1<p2){

            double resta = p2 -p1;
            System.out.println(n2 + " pesa más que " + n1+" con una diferencia de "+resta);

        }

    }
}
