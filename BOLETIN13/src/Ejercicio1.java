import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> Primera = new ArrayList<Integer>();
        Primera.add(1);
        Primera.add(10);
        List<Integer> Segunda = new ArrayList<Integer>();
        Segunda.add(5);
        Segunda.add(12);
        Primera.addAll(Segunda);
        System.out.println(Primera);

    }
}
