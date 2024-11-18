/**
 * Boletín 3 Ejercicio 5; Dados 3 números que se supoñen distintos, indicar cal é o maior.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */

import java.util.Scanner;

public class Ejercicio5 {
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.println("Dame el primer numerito");
            int n1 = entrada.nextInt();

            System.out.println("Dame el segundo numerito");
            int n2 = entrada.nextInt();

            System.out.println("Dame el tercer numerito");
            int n3 = entrada.nextInt();

            if (n1>n2 && n1>n3) {
                System.out.println(n1 + "es mayor que " + n2 + " y " + n3);
            }else if (n2>n1 && n2>n3){
                System.out.println(n2 + "es mayor que " +n1 + " y "+n3);
            }else if (n3>n2 && n3>n1){
                System.out.println(n3 + " es mayor que " +n2 + " y "+n1);
            }

        }
}