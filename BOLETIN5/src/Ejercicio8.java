import java.util.Scanner;

/**
 * Boletín 5 Ejercicio 8; Codificar o programa que solicite 10 números por consola e calcule a súa suma. Si o usuario introduce en calquera momento o número 999, deixa de solicitar máis números e presenta o valor da súma acadada ata ese momento.
 *
 * @author SAUL ALVAREZ MONZON
 * @version 1.1
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce 10 números de los cuales quieras saber la suma entre ellos: ");
        int suma = 0;
        int contador = 0;

        while (contador < 10) {
            int num = entrada.nextInt();

            if (num == 999) {
                break;
            }
            suma += num;
            contador++;

        }

        System.out.println("La suma de los números introducidos es: " + suma);

    }
}