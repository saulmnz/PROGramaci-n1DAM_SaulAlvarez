/**
 * Boletín 3 Ejercicio 2; Dous números de tipo short. Se o primeiro é maior ou igual que o segundo,visualizaremos a resta. En calquera caso visualizaremos a suma.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        short n1 = scanner.nextShort();

        System.out.println("Introduce el segundo número");
        short n2 = scanner.nextShort();

        if (n1 >= n2){
            int resta = n1 - n2;
            System.out.println("La resta entre los número da resultado = "+resta);
        } else if (n1 < n2){
            int suma = n1 + n2;
            System.out.println("Al ser el segundo número mayor que el primero, la suma es = "+suma);
        }

    }
}
