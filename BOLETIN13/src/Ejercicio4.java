import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> Positivos = new ArrayList<Integer>();
        List<Integer> Negativos = new ArrayList<Integer>();
        int numeros = scanner.nextInt();
        while (numeros != 0) {
            if (numeros > 0) {
                Positivos.add(numeros);
            } else {
                Negativos.add(numeros);
            }
            numeros = scanner.nextInt();
        }



        Positivos.removeIf(n -> n >= 10);
        Negativos.removeIf(n -> n <= -10);

        int contador = 0;
        int contadorN= 0;

        for (int n : Positivos) {
            contador += n;
        }
        for (int n : Negativos){
            contadorN += -n;
        }
        System.out.println("Suma Coleccion Negativa -"+contadorN);
        System.out.println("Suma Colección Positiva "+contador);
        System.out.println("Lista de numeros + " + Positivos);
        System.out.println("Lista de numeros - " + Negativos);




    }
}
