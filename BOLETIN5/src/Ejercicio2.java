import java.util.Scanner;
/**
 * Boletín 5 Ejercicio 2;  Realiza un programa que calcule a suma e o produto dos números comprendidos entre 10 e 90.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio2 {
    public static void main(String[] args) {
     int n1 = 10;
     int n2 = 90;
     int n = 0;             //Contenedor total suma
        double m =1;        //Contenedor total multplicación
        while (n1<=n2){
            n = n1 + n;
            m = n1 * m;
            n1++;
        }
        System.out.println("El resultado de la multiplicación de los números comprendidos entre 10 y 90 es "+m);
        System.out.println("El resultado de la suma de los números comprendidos entre 10 y 90 es "+n);
    }
}
