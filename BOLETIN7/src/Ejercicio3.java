import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] notas = {3, 7, 6, 8, 2, 7, 4, 6, 8, 8, 3, 4, 6, 8, 2, 8, 4, 8, 8, 2, 3, 4, 9, 8, 2, 3, 10, 6, 8, 5};
        String[] nombres = {"Ana", "Juan", "Carlos", "Marta", "Luis","Pedro", "Laura", "Javier", "Sofía", "Pablo","Clara", "Ricardo", "Carmen", "Raúl", "Beatriz", "María", "José", "Antonio", "Elena", "David", "Teresa", "Miguel", "Patricia", "Francisco", "Isabel","Álvaro", "Lucía", "Raquel", "Andrés", "Nerea", "Rubén"};

        System.out.println("Personas que aprobaron: "+evaluar(notas));
        System.out.println("Personas que suspendieron: "+suspenso(notas));
        System.out.println("Media de las notas: "+media(notas));
        System.out.println("La nota más alta es un "+notalta(notas));
        System.out.println("Alumnos aprobados = "+Arrays.toString(nombreaprobado(notas, nombres)));

        System.out.println("Introduce el nombre del alumno al cual quieres consultar la nota ");
        String nombre = entrada.next();
        System.out.println(visualizar(notas, nombres, nombre ));

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
    public static int visualizar (int  []notas, String[]nombres, String nombre){
        int nota = 0;
        for (int i=0; i<notas.length;i++){
            if (nombre.equals(nombres[i])){
                nota = notas[i]; break;
            }
            else {nota = -1;
            }
        }
        return nota;
    }
    public static String[] nombreaprobado (int [] notas, String[]nombres){
        int aprobados=0;
        for (int i = 0; i<notas.length;i++) {
            if (notas[i] >= 5) {
                aprobados++;
            }
        }

        String[] aluaprobado = new String[aprobados];

        int aux = 0;

        for ( int i = 0; i < notas.length;i++){
            if (notas[i]>=5){
                aluaprobado[aux]= nombres[i]; aux++;
            }
        }
        return aluaprobado;
    }
}
