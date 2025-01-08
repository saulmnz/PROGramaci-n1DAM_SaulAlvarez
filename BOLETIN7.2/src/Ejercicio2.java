import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] mapa = {
                {"Trampa","Dormitorio","Trampa"},
                {"Tesoro","Entrada","Trampa"},
                {"Tesoro","Trampa","Trampa"}
        };

        System.out.println("Introduce la fila");
        var coordenada1 = sc.nextInt();

        System.out.println("Introduce la columna");
        var coordenada2 = sc.nextInt();
        elegirHabitaculo(mapa,coordenada1,coordenada2);
    }

    static void elegirHabitaculo(String[][] mapa,int coordenada1, int coordenada2){

        if (mapa[coordenada1][coordenada2].equalsIgnoreCase("Tesoro"))

        {
            System.out.println("Enorabuena has ganado");
        }

        else if (mapa[coordenada1][coordenada2].equalsIgnoreCase("Trampa"))

        {
            System.out.println("Has caido en una trampa");
        }

        else if (mapa[coordenada1][coordenada2].equalsIgnoreCase("Entrada"))

        {
            System.out.println("¿Realmente quieres salir?");
        }

        else

        {
            System.out.println("Has entrado a un dormitorio.Crees tener tiempo para dormir no?");
        }
    }
}