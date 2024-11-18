import java.util.Scanner;

/**
 * Boletín 3 Ejercicio 3; Teclear un número por teclado, mostre por consola o signo “ + “ se o número é positivo, o signo “ –“ se é negativo e “ 0 “ se é cero.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame el numerito ;)");
        int n1 = scanner.nextInt();

        if (n1>0){
            System.out.println("Signo del numerito: +");
        } else if (n1<0){
            System.out.println("Signo del numerito: -");
        } else if (n1==0){
            System.out.println("Metiches un 0, no tiene signo");
        }
    }
}
