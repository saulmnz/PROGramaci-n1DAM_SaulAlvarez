
import java.util.Scanner;
/*
 * Boletín 6 Ejercicio 10; Escribir unha función que calcule de forma recursiva o máximo común divisor de dous números.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Dame 2 numeros para saber su maximo común divisor: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        System.out.println("el resultado es: " + maxcd(n1, n2));
        maxcd(n1, n2);
    }

    static int maxcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }

        return maxcd(n2, n1 % n2);
    }
}



