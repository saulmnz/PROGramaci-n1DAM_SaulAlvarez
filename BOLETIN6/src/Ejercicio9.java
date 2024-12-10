/*
 * Boletín 6 Ejercicio 9; Escribe a función que resolva a serie de Fibonaci de forma recursiva.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        int n = 0;
        int m = 1;
        int secuencia = 10;
        fibonacci(n,m,secuencia);
    }
    public static void fibonacci (int n, int m, int secuencia){
        if (secuencia==0){
            return ;
        }
        System.out.println(n);
        fibonacci(m,n +m,secuencia-1);
    }
}
