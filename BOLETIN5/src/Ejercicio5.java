/**
 * Boletín 5 Ejercicio 5; Codifica un programa que lea o soldo de cada un dos traballadores dunha empresa e obteña o número deles que ganan entre 1000 e 1750 €, ámbolos dous incluídos e, a porcentaxe de traballadores que ganan menos de 1000 €. Tendo en conta que non se coñece con antelación o numero de traballadores da empresa e non se admiten os soldos negativos (utiliza como condición de fin un soldo 0).
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int []sueldos = {120,290,1000,900,245,1750,1455};
        int salbajo=0;
        int salalto=0;

        for (int i = 0; i < sueldos.length; i++){
            if (sueldos[i]>=1000&&sueldos[i]<1750){
                salalto++;
            } else if (sueldos[i]<1000){
                salbajo++;

            }
        }
        System.out.println(salalto +" trabajdores ganan entre 1000 y 1750 y "+salbajo +" trabajdores ganan menos de 1000");
    }
}
