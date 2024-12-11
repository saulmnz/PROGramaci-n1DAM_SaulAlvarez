import java.util.Arrays;

public class Ejercicipo8 {
    public static void main(String[] args) {

        int[] enteros = {1, 4, 2, 1, 5, 7, 0, 8,4, 22};
        System.out.println(Arrays.toString(pares(enteros)));
    }

    public static int[] pares(int[] enteros) {
        int par = 0;
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] % 2 == 0) {
                par++;
            }
        }
        int[] respares = new int[par];
        int aux = 0;

        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] % 2 == 0) {
                respares[aux] = enteros[i];
                aux++;
            }

        }
        return respares;
    }
}
