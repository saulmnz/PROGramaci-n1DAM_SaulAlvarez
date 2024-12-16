public class Ejercicio6 {
    public static void main(String[] args) {

        int[] listaOrdenada = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(listaOrdenada(listaOrdenada, 14));

    }

    static int listaOrdenada(int[] lista, int num) {
        int mitad = lista.length / 2;
        int mitadI = mitad / 2;
        int mitadD = mitad + mitadI;
        if (lista[mitad] < num) {
            if (lista[mitadD] < num) {
                for (int i = mitadD + 1; i < lista.length; i++) {
                    if (lista[i] == num) {
                        return i;
                    }
                }
            } else if (lista[mitadD] == num)
                return mitadD;

            else {
                for (int i = mitad + 1; i < mitadD; i++) {
                    if (lista[i] == num) {
                        return i;
                    }
                }

            }
        } else if (lista[mitad] == num)
            return mitad;

        else {
            if (num > lista[mitadI]) {
                for (int i = mitadI + 1; i < mitad; i++) {
                    if (lista[i] == num) {
                        return i;
                    }
                }
            } else if (num == lista[mitadI]) return mitadI;
            else {
                for (int i = 0; i < mitadI; i++) {
                    if (lista[i] == num) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}