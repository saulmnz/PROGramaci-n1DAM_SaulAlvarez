/*
 * Boletín 6 Ejercicio 7; Escribe a función que resolva o factorial dun número de forma recursiva.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio7 {
    public static void main(String[] args) {

        int resultado = factorial(6);
        System.out.println("El factorial es: " + resultado);
    }

    public static int factorial (int n){
            if (n==1) {
                return 1;
            }

            else {
                return n*factorial(n-1);
            }

    }
}
