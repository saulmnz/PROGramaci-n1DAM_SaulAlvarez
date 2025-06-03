import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        for (int i = 100; i != 0; i--){
            numeros.add((int)(Math.floor(Math.random()*10)+1));
        }

        System.out.println(numeros);
        numeros.removeIf(n -> n == 7);
        numeros.removeIf(n -> n == 5);
        System.out.println(numeros);

    }

}
