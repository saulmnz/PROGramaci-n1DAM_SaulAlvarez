import java.util.Scanner;
/*
 * Boletín 6 Ejercicio 4;  Escribe unha función a que se lle pase como parámetros de entrada a cantidade de dias, horas e minutos. A función calculará e devoltará o número de segundos que existen nos datos de entrada.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio4 {
    public static void main(String[] args) {
    segundos();
    }
    public static void segundos (){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce el número de días ");
        int dias = entrada.nextInt();

        System.out.println("Introduce el número de horas ");
        int horas = entrada.nextInt();

        System.out.println("Introduce el número de minutos ");
        int minutos = entrada.nextInt();

        int cambid = dias * 86400;
        int cambioh = horas * 3600;
        int cambiomin = minutos * 60;
        int cambiosegundos = cambid+cambioh+cambiomin;
        System.out.println("El total de segundos es :"+cambiosegundos);
    }
}
