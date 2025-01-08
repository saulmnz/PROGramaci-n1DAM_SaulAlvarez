/*
 * Boletín 6 Ejercicio 6
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio6 {
    public static void main(String[] args) {

        String cadena = " www.javadende0. com";
        String[] separado = cadena.split("java");

        String cadena1 = separado[0]+ "java";
        String cadena2 = separado[1];

        System.out.println(cadena1);
        System.out.println(cadena2);

        String concatenado = cadena1 + cadena2;
        System.out.println("String concatenado = " +concatenado);

    }
}
