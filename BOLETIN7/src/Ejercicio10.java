import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        int []taboa = {2,4,6,2,8,9};
        System.out.println(Arrays.toString(borrar(taboa,8)));
    }

    public static int []borrar (int []taboa, int valor){
        int [] nuevataboa = new int[taboa.length -1];
        int contador = 0;
        for (int i= 0; i< taboa.length;i++){
            if (valor!=taboa[i]){
                nuevataboa[contador]=taboa[i];
                contador++;
            }

        }

        return nuevataboa;
    }

}

