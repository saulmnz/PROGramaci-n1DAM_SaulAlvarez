import java.util.Scanner;
/**
 * Boletín 5 Ejercicio 3; Deseña un programa que calcule o área dun rectángulo cuxa base e altura pides por teclado. Asegúrate que estes valores sexan positivos, para eso valida os datos.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la base del rectángulo");
        double base = entrada.nextDouble();

        System.out.println("Introduce la altura");
        double altura = entrada.nextDouble();


        while (base > 0 && altura > 0){
            double area = base * altura;
            System.out.println("Area del rectángulo "+ area);
            if (base < 0 && altura <0){
                break;
            }
        }
        System.out.println("No se puede calcular el area con numeros negativos");
    }
}
