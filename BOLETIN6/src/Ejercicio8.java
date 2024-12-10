/*
 * Boletín 6 Ejercicio 8; Escribe a función que resolva o resultado de elevar n veces o número m (mn) de forma recursiva..
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println(elevada(1, 3,2));
    }

    public static int elevada (int ele, int m, int n){
         for (int i = 1; i<=m;i++) {
             ele *= m;
         }
         if (0==n) {
             return 0;
         }
        return ele;
    }
}


