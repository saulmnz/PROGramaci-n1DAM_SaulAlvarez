/*
 * Boletín 6 Ejercicio 11
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio11 {
    public static void main(String[] args) {

        String cadena = "Ola, son alumno de DAM1, e son programador desde o 2024";

        int contadorletras=0;
        int contadorespazos=0;
        int contadordixitos=0;

        for (int i = 0; i < cadena.length(); i++){

            char caracter = cadena.charAt(i);
            cadena.charAt(i);

            if (caracter == ' '){
                contadorespazos++;
            }

            else if (Character.isLetter(caracter)) {
                contadorletras++;
            }

            else if (Character.isDigit(caracter)) {
                contadordixitos++;
            }
        }

        System.out.println("Número de Letras = "+contadorletras+ " Número de espazos = "+contadorespazos+" Numero de dixitos = " + contadordixitos);

    }
}

