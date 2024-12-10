import java.util.Scanner;
/*
 * Boletín 6 Ejercicio 5; Deseña unha función a que se lle pasan as horas e minutos de dous intantes de tempo co seguinte prototipo: static int diferenciaMin (int hora1, int minuto1, int hora2, int minuto2) A función devoltará a diferencia en minutos que existen entre os dous instantes de tempo.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el numero de la hora en el primer momento :");
        int hora1 = entrada.nextInt();

        System.out.println("Introduce el numero de la minuto en el primer momento :");
        int minuto1 = entrada.nextInt();

        System.out.println("Introduce el numero de la hora en el segundo momento :");
        int hora2 = entrada.nextInt();

        System.out.println("Introduce el numero de la minuto en el segundo momento :");
        int minuto2 = entrada.nextInt();

        int diferencia = diferenciaMin(hora1,minuto1,hora2,minuto2);
        System.out.println("La diferencia en minutos es "+diferencia);
    }

    public static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {

        int tiempo1EnMinutos = hora1 * 60 + minuto1;
        int tiempo2EnMinutos = hora2 * 60 + minuto2;

        int diferencia = Math.abs(tiempo2EnMinutos - tiempo1EnMinutos);

        return diferencia;

        }

    }

