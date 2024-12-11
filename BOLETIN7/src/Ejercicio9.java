import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio9 {
    public static void main(String[] args) {

        int [] taboa = {2,3,12,1,8,5,2,3,7,8,8,9,10,1,11,12,51,5,2,3,12};
        System.out.println(Arrays.toString(repetir(taboa)));
    }

    public static int[] repetir (int []taboa){
        int norepetido=0;
        int [] ordenada = new int[taboa.length];
        int nmax = 0;
        int contador = 0;
        for (int i = 0; i<taboa.length;i++){
            if (taboa[i]>nmax){
                nmax = taboa[i];/*
                ordenada[contador]=taboa[i];
                contador++;
                */
            }

        }
        for (int i = nmax; i>0; i-- ) {

            for (int j = 0; j< taboa.length; j++) {
                if (taboa[j] == i) {
                    ordenada[contador] = taboa[j];
                    contador++;
                }
            }}

        int y = 0;
        int contador2=0;
        for (int i = 0; i<ordenada.length; i++) {
            if (y != ordenada[i]) {
                contador2++;
                y = ordenada[i];
            }
        }

        int [] acabar = new int[contador2];
        y = 0;
        contador2 = 0;
        for (int i = 0; i<ordenada.length; i++) {
            if (y != ordenada[i]) {
                acabar[contador2] = ordenada[i];
                contador2++;
                y = ordenada[i];
            }
        }


        return acabar;
    }

}
