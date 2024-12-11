import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios7 {
    public static void main(String[] args) {

    int []array = {1,3,4,5,7,8,9,11};

        System.out.println(Arrays.toString(copia(array)));

    }

    public static int [] copia (int []array){
        int []copia = new int[array.length];
        for (int i = 0; i < array.length; i++){
            copia[i]=array[i];
        }

        return copia;

    }

}
