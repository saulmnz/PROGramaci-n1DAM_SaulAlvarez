/*
 * Boletín 6 Ejercicio 8; Escribe a función que resolva o resultado de elevar n veces o número m (mn) de forma recursiva..
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */

public class Ejercicio8Recursivo {
    public static void main(String[] args) {
        int m = 4;
        int n = 3;
        int resultado = recursiva(m,n);
        System.out.println(m + " elevado a "+n+" es = "+ resultado);
    }
    public static int recursiva ( int m, int n){
        if (n == 0) {
            return 1;
        }
        return m*recursiva(m,n-1);
    }
}
