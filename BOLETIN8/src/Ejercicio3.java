/*
 * Boletín 6 Ejercicio 3
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio3 {
    public static void main(String[] args) {


        String java = "Java dende 0";
        String invertido = "";

        for (int i = java.length() - 1; i >= 0; i--) {
            invertido += java.charAt(i);
        }

        System.out.println(invertido);
    }
}
