import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio8 {

    // Método estático para realizar la unión de dos conjuntos genéricos
    static <E > Set < E > union(Set < E > conxunto1, Set < E > conxunto2) {
        // Crear un nuevo conjunto que contendrá la unión
        Set<E> resultado = new HashSet<>(conxunto1);
        // Devolver ( de las listas concatenadas ) los elementos que se repiten en una y en otra
        resultado.retainAll(conxunto2);
        // Devolver el conjunto resultante con la unión
        return resultado;
    }

    public static void main (String[]args){
        // Crear el primer conjunto de enteros
        Set<Integer> conjunto1 = new HashSet<>();
        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);
        conjunto1.add(4);

        // Crear el segundo conjunto de enteros
        Set<Integer> conjunto2 = new HashSet<>();
        conjunto2.add(3);
        conjunto2.add(4);
        conjunto2.add(5);

        // Llamar al método union con los dos conjuntos y guardar el resultado
        Set<Integer> unionConjuntos = union(conjunto1, conjunto2);

        // Imprimir la unión de los conjuntos por pantalla
        System.out.println("Unión de los conjuntos: " + unionConjuntos);
    }
}


