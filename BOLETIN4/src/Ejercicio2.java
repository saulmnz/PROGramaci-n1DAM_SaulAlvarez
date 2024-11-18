import java.util.Scanner;

/**
 * Boletín 3 Ejercicio 2; Dous números de tipo short. Se o primeiro é maior ou igual que o segundo,visualizaremos a resta. En calquera caso visualizaremos a suma.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduza a súa opción (1-3) para saber el area correspondiente: ");

        System.out.println("1. Triangulo");

        System.out.println("2. Cuadrado");

        System.out.println("3. Circulo");

        int opcion = entrada.nextInt();

        switch (opcion){
            case 1:

                System.out.println("Introduce la base del triángulo");;
                double base = entrada.nextDouble();
                System.out.println("Introduce la altura del triángulo");;
                double altura = entrada.nextDouble();
                double area = base * altura / 2;
                System.out.println("El area del triángulo es "+area);
                break;

            case 2:

                System.out.println("Introduce el lado del cuadrado");;
                double lado = entrada.nextDouble();
                System.out.println("El area del cuadrado es "+lado);
                break;

            case 3:

                System.out.println("Introduce el radio del círculo");;
                double radio = entrada.nextDouble();
                double areaCirculo = radio*radio * Math.PI / 2;
                System.out.println("El area del círculo es "+areaCirculo);
                break;
        }
    }
}
