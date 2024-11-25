import java.util.Scanner;
/**
 * Boletín 5 Ejercicio 4; Codifica un programa que solicite un número e visualice a táboa de multiplicar dese número. O programa seguirá pedindo números ata que o usuario pulse o número cero.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el número del que quieras conocer su tabla: ");
        int num = entrada.nextInt();
        int tabla;
        while(num!=0) {
            for (int i = 1; i <= 10; i++) {
                tabla = i * num;
                System.out.println(i + " x " + num +" = "+tabla);
            }

            System.out.println("Introduce el número del que quieras conocer su tabla: ");
            num = entrada.nextInt();
        }
    }
}
