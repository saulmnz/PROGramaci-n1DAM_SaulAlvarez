import java.util.Enumeration;

/*
 * Boletín 6 Ejercicio 6; Escribe unha función que diga si dous números enteiros son amigos. Dous números a e b son amigos si a suma dos divisores propios (distintos del mesmo) de a e igual a b. E biceversa. Para probar pódense usar os números 220 e 284, que son amigos.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio6 {
    public static void main(String[] args) {

        int n1 = 220;
        int n2 = 284;

        if (sonAmigos(n1, n2)) {
            System.out.println(n1 + " y " + n2 + " son números amigos.");
        } else {
            System.out.println(n1 + " y " + n2 + " no son números amigos.");
        }
    }
    public static boolean sonAmigos(int n1, int n2) {
        // La suma de los divisores propios de a (excluyendo a mismo)
        int sumaDivisoresn1 = divisores(n1);

        // La suma de los divisores propios de b (excluyendo b mismo)
        int sumaDivisoresn2 = divisores(n2);

        // Si la suma de los divisores de a es igual a b y la suma de los divisores de b es igual a a, son amigos
        return sumaDivisoresn1 == n2 && sumaDivisoresn2 == n1;
    }
    public static int divisores (int num){
        int suma = 0;
        for (int i = 1; i <= num/2 ; i++){
            if (num % i == 0 ){
                suma += i;
            }
        }
        return suma;
    }
}
