import java.util.Scanner;

/**

 * Boletín 4 Ejercicio 1; Un almacén clasifica os seus produtos segundo a seguinte táboa de vendas anuais:

 * Vendas anuais			Artigo de consumo
 * < = 100 produtos			baixo
 * >100 e < = 500			medio
 * > 500 e < = 1000			alto
 * > 1000 				primeira necesidade

 * Coñecido o nome do artigo e as vendas anuais. Indicar de que tipo é.

 * @version 1.1
 * @author SAUL ALVAREZ MONZON

 */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el número de ventas anuales del producto");
        int ventas = entrada.nextInt();

        if (ventas<=100){
            System.out.println("Articulo de consumo bajo");
        }
        if (ventas>100&&ventas<=500){
            System.out.println("Articulo de consumo medio");
        }
        if (ventas>500&&ventas<=1000){
            System.out.println("Articulo de consumo alto");
        }
        if (ventas>1000){
            System.out.println("Articulo de primera necesidad");
        }
    }
}
