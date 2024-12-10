/**
 * Boletín 6 Ejercicio 1; Escribir unha función o que se lle pasen dous enteiros e mostre tódolos números comprendidos entre eles.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        comprendidos(2,59);
    }
public static void comprendidos (int n1, int n2){
        if (n1>n2){
           int contenedor = n1;
           n1 = n2;
           n2 = contenedor;
        }
        for (int i=n1 ; i<n2 ; i++) {
            System.out.println(i);;
        }
    }
}
