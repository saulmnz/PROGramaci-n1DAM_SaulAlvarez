import com.sun.security.jgss.GSSUtil;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] notas = {3, 7, 6, 8, 2, 7, 4, 6, 8, 8, 3, 4, 6, 8, 2, 8, 4, 8, 8, 2, 3, 4, 9, 8, 2, 3, 10, 6, 8, 5};
        System.out.println("Personas que aprobaron: "+evaluar(notas));
        System.out.println("Personas que suspendieron: "+suspenso(notas));
        System.out.println("Media de las notas: "+media(notas));
        System.out.println("La nota más alta es un "+notalta(notas));
    }


    public static int evaluar(int[] notas) {
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                contador++;

            }

        }

        return contador;
    }

    public static int suspenso(int[] notas) {
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 5) {
                contador++;

            }
        }
        return contador;
    }

    public static double media (int[]notas){
        double media = 0;
        for (int i = 0; i<notas.length;i++){
            media = notas[i]+media;
        }
        return media / notas.length;
    }

    public static int notalta (int []notas){
        int alta = 0;
        for (int i = 0 ; i < notas.length; i++){
           if (notas[i]>alta){
               alta = notas[i];
           }
        }
        return alta;
    }
}
