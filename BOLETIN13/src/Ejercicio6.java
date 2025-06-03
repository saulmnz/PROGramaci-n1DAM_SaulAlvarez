import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Ejercicio6 {

    public static void main(String[] args) {

        List<Integer> Numerosaleatorios = new ArrayList<>() {};
        TreeSet<Integer> Do1ao7 = new TreeSet<>();
        TreeSet<Integer> Senrepetir = new TreeSet<>();
        TreeSet<Integer> Repetidos = new TreeSet<>();
        TreeSet<Integer> Unicos = new TreeSet<>();


        Comparator<Integer> c = Comparator.naturalOrder();
        Numerosaleatorios.sort(c);


        for (int i = 0; i<20;i++){

            int numero =  (int) (Math.random()*10+1);
            Numerosaleatorios.add(numero);

        }


        for (Integer num :Numerosaleatorios) { // Mediante este bucle recorreremos el array de numeros

            if (Senrepetir.contains(num)) {
                Repetidos.add(num);

            } else {
                Senrepetir.add(num);
                if (num <= 7 && num >= 1) {
                    Do1ao7.add(num);
                }
            }

        }


        System.out.println("Array de numeros aleatorios completo "+ Numerosaleatorios);


        System.out.println("Array de numeros sen Repetir "+ Senrepetir);


        System.out.println("Array de numeros repetidos "+ Repetidos);

        System.out.println("Array de numeros do 1 ao 7 sen estar repetidos "+ Do1ao7);    }
}

