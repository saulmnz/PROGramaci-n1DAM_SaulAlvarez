import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {

        int[] lista = {1, 43, 21, 12, 5};
        int[] listainvertida = new int[lista.length];

        for (int i = 0;i< lista.length;i++){
            listainvertida[i] = lista[lista.length -1 -i];

        }

        System.out.println(Arrays.toString(listainvertida));

    }
}
