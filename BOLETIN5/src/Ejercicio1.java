/**
 * Boletín 5 Ejercicio 1; Calcula a cantidade de números negativos, positivos e ceros que hai nun grupo de 10 números enteiros.
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */

public class Ejercicio1 {
    public static void main(String[] args) {

        int [] numero = {1,-2,-3,-5,7,0,-4,5,9,-1};

        int negativo=0;
        int positivo=0;
        int cero=0;

        for (int i=0;i< numero.length;i++){

            if (numero[i]==0){
                cero++;

            } else if (numero[i]>0) {
                positivo++;

            } else if (numero[i]<0) {
                negativo++;

            }
        }

        System.out.println("Hay " + negativo + " numeros negativos," + positivo +" numeros positivos y " + cero + " cero");

        }
    }
