import java.util.Scanner;
/**
 * Boletín 6 Ejercicio 3; Realizar unha función que mostre a área dun cubo segundo se lle especifique. Para distinguir o caso se lle pasará a opción cun número 1 (área) ou 2 (volume). Ademáis, hai que pasarlle a lonxitude do lado.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        cubo();
    }

    public static void cubo (){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Quieres saber el area ( 1 ) o el volumen ( 2 ) del cubo ?");
        double opcion = entrada.nextDouble();
        System.out.println("Introduce el lado del cubo : ");
        double lado = entrada.nextDouble();

        switch ((int) opcion){
            case 1:
                System.out.println("Introduce el lado del cubo : ");
                double area = lado * lado * 6;
                System.out.println("El area del cubo es "+ area);
                break;

            case 2:
                System.out.println("Introduce el lado del cubo : ");
                double volumen = lado * lado * lado;
                System.out.println("El volumen del cubo es " + volumen);
                break;

            default:
                System.out.println("Opción no válida. Debes elegir opción 1 o 2.");
                break;
        }
    }
}
