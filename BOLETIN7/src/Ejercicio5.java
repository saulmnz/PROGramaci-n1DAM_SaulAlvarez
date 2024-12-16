public class Ejercicio5 {
    public static void main(String[] args) {
        int[] lista = {3,1,66,321,345,621,71,118,99,11};
        System.out.println("El índice de tu número es (si aparece -1 es porque tu número no está en la lista) : "+ indiceLista(lista,321));
    }

    public static int indiceLista(int[] lista, int num) {
        for (int i = 0;i<lista.length;i++) {
            if (lista[i]==num) {
                return i;
            }
        }
        return -1;
    }
}