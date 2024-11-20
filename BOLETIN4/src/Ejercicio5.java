import java.util.Scanner;

/**
 * Boletín 4 Ejercicio 4; Deseña unha aplicación na que, dado un número de DNI, calcule a letra que lle corresponde. Observa que un número de 8 díxitos entra dentro do rango dun tipo int.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce los números de tu DNI para saber la letra");

        System.out.print("Número del DNI (8 dígitos): ");
        int dni = entrada.nextInt();

        char[] letras = {
                'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };

        int indice = dni % 23;
        char letra = letras[indice];

        System.out.println("La letra correspondiente al DNI " + dni + " es: " + letra);
        System.out.println();
    }
}
