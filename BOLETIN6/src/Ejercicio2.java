import java.util.Scanner;
/**
 * Boletín 6 Ejercicio 2; Deseñar a función eco() a que se lle pasa como parámetro un número n e mostra por pantalla n veces a mensaxe “Ecoo…"
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Introduce el número de veces que quieres hacer ECOOO ");
        repeticion("Eco");
    }
    public static void repeticion (String Eco){
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        Eco = "Eco";
        String i = "o";
        System.out.println(Eco + i.repeat(n));
    }
}
