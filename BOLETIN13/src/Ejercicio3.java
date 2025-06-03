import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();

        for (int i = 100; i != 0; i--){
            numeros.add((int)(Math.floor(Math.random()*10)+1));
        }

        Iterator<Integer> NI = numeros.iterator();

        while (NI.hasNext()){
            int num = NI.next();
            if (num == 5 || num == 7) {
                NI.remove();
            }
        }
        System.out.println(numeros);
    }
}
