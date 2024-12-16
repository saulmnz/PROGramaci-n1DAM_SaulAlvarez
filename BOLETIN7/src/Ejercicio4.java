import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        char[] lDni = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        System.out.println("Dime el número del DNI para saber la letra que le corresponde: ");
        Scanner sc = new Scanner(System.in);

        int nDni= sc.nextInt();;
        int resto = nDni % 23;

        System.out.println(lDni[resto]);

    }

}
