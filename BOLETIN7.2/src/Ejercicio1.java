import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Juego de Tragaperras
 * @version 1.0
 * @author Saul Alvarez Monzon
 */

public class Ejercicio1 {
    /**
     * Función principal
     * @param args parámetros del juego
     *
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[][] horario = {

                {"MAT", "HIS", "PISC"},
                {"FUTB", "PROG", "MAT"},
                {"MAT", "HIS", "GYM"},
                {"MAT", "HIS", "PISC"},
                {"FUTB", "PROG", "MAT"},
                {"MAT", "HIS", "MAT"},
                {"MAT", "HIS", "PISC"},

        };

        while (true) {
            mostrar(horario);
            menu();
            int opcion = entrada.nextInt();
             switch (opcion) {
                 case 0: System.exit(0);

                 case 1:
                     indicedias();
                     System.out.println("---Elije el día ---");
                     int dia = entrada.nextInt();
                     horas();
                     System.out.println("---Elije la hora---");
                     int hora = entrada.nextInt();
                     System.out.println("---Que materia deseas cambiar---");
                     String materia = entrada.next();
                     horario = cambiar(horario, dia, hora, materia);
                     break;

                 case 2:
                     indicedias();
                     System.out.println("---Elije el día ---");
                      dia = entrada.nextInt();
                     horas();
                     System.out.println("---Elije la hora---");
                      hora = entrada.nextInt();
                     System.out.println("---Que materia deseas cambiar---");
                      materia = entrada.next();
                      horario = agregar(horario, dia ,hora, materia);
                     break;


             }
        }
    }

    /**
     * Muestra el horario
     * @param horario array de dos dimensiones
     */

    public static void mostrar(String[][] horario) {
        /**
         *
         * @param :
         */
        for (int i = 0; i < horario.length; i++) {
            System.out.println(Arrays.toString(horario[i]));
            ;
            for (int j = 0; j < horario[i].length; j++) {
                System.out.println(horario[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Función para cambiar las horas y las actividades
     * @param horario array de dos dimensiones con los parámetros
     * @param dia variable que representa los días
     * @param hora  variable que representa las horas
     * @param nuevaActividad variable que representa la nueva actividad a cambiar
     * @return la nueva actividad cambiada en el array bidimensional
     */

    public static String[][] cambiar(String[][] horario, int dia, int hora, String nuevaActividad) {
        dia = dia - 1;
        hora = hora - 1;

        for (int i = 0; i < horario.length; i++) {
            if (i == dia) {
                for (int j = 0; j < horario.length; j++) {
                    if (j == hora) {
                        horario[i][j] = nuevaActividad;
                    }
                }
            }
        }
        return horario;
    }

    /**
     * Funcion. Muestra los dias de la semana que serán una opción en el switch de la main, haciendo referencia a las filas
     */

    public static void indicedias() {

        System.out.println("1.Lunes");
        System.out.println("2.Martes");
        System.out.println("3.Miercoles");
        System.out.println("4.Jueves");
        System.out.println("5.Viernes");
        System.out.println("6.Sabado");
        System.out.println("7.Domingo");

    }

    /**
     * Funcion. Muestra los dias de la semana que serán una opción en el switch de la main, haciendo referencia a las distintas funciones creadas anteriormente
     */

    public static void menu() {
        System.out.println("0. Cerrar");
        System.out.println("1. Cambiar materia");
        System.out.println("2. Agregar a un hueco libre");
    }

    /**
     * Funcion. Muestra los dias de la semana que serán una opción en el switch de la main, haciendo referencia a las horas
     */

    public static void horas() {
        System.out.println("Primera hora");
        System.out.println("Segunda hora");
        System.out.println("Tercera hora");
    }

    /**
     * Función para agregar en un espacio null del array bidimensional una nueva actividad
     * @param horario Array bidimensional
     * @param dia Parámetro de la función para saber el dia que queremos cambiar
     * @param hora Parámetro de la función hora para saber que hora que queremos cambiar
     * @param nuevaActividad  Parámetro de la función la cual será la nueva actividad agregada en el null
     * @return array bidimensional
     */

    public static String[][] agregar(String[][] horario, int dia, int hora, String nuevaActividad) {
        dia = dia - 1;
        hora = hora - 1;

        for (int i = 0; i < horario.length; i++) {
            if (i == dia) {
                for (int j = 0; j < horario.length; j++) {
                    if (j == hora || horario[i][j]==null) {
                        horario[i][j] = nuevaActividad;
                    }
                }
            }
        }
        return horario;
    }
}