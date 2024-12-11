import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
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

    public static void mostrar(String[][] horario) {
        for (int i = 0; i < horario.length; i++) {
            System.out.println(Arrays.toString(horario[i]));
            ;
            for (int j = 0; j < horario[i].length; j++) {
                System.out.println(horario[i][j]);
            }
            System.out.println();
        }
    }

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

    public static void indicedias() {

        System.out.println("1.Lunes");
        System.out.println("2.Martes");
        System.out.println("3.Miercoles");
        System.out.println("4.Jueves");
        System.out.println("5.Viernes");
        System.out.println("6.Sabado");
        System.out.println("7.Domingo");

    }

    public static void menu() {
        System.out.println("0. Cerrar");
        System.out.println("1. Cambiar materia");
        System.out.println("2. Agregar a un hueco libre");
    }

    public static void horas() {
        System.out.println("Primera hora");
        System.out.println("Segunda hora");
        System.out.println("Tercera hora");
    }

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