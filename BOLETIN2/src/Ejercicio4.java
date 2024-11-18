/**
 * Boletín 2 Ejercicio 4; Ler 2 números e calcular a suma, despois a resta, a continuación o produto e por último o cociente.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número; realizaremos la suma, resta, producto y cociente de los numeros introducidos");
        double n1 = scanner.nextDouble();

        System.out.println("Introduce el segundo número");
        double n2 = scanner.nextDouble();

        double suma = n1 + n2;
        System.out.println("La suma de los números es = " + suma);

        double resta = n1 -n2;
        System.out.println("La resta de los números es = " + resta);


        double producto = n1 * n2;
        System.out.println("El producto de los números es = " + producto);

        if (n2!=0) {
            double cociente = n1 / n2;
            System.out.println("El cociente de los números es = " + cociente);
        } else {
            System.out.println("No se puede dividir un número entre 0");
        }

    }
}
