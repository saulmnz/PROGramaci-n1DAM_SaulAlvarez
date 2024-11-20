import java.util.Scanner;

/**
 * Boletín 4 Ejercicio 4; Escribe un programa que solicite o usuario un número comprendido entre 1 e 99. O programa ten que mostralo con letras, por exemplo, para o 56, mostrará: “Cincuenta e seis”..
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número entre 0 y 99: ");
            numero = entrada.nextInt();
        }

        while (numero < 0 || numero > 99);

        int decenas = numero / 10;

        int unidades = numero % 10;


        switch (decenas) {
            case 0:
                break;
            case 1:
                if (unidades == 0) {
                    System.out.print("Diez");
                } else if (unidades == 1) {
                    System.out.print("Once");
                } else if (unidades == 2) {
                    System.out.print("Doce");
                } else if (unidades == 3) {
                    System.out.print("Trece");
                } else if (unidades == 4) {
                    System.out.print("Catorce");
                } else if (unidades == 5) {
                    System.out.print("Quince");
                } else {
                    System.out.print("Dieci");
                }
                break;
            case 2:
                if (unidades == 0) {
                    System.out.print("Veinte");
                } else {
                    System.out.print("Veinti");
                }
                break;
            case 3:
                System.out.print("Treinta");
                break;
            case 4:
                System.out.print("Cuarenta");
                break;
            case 5:
                System.out.print("Cincuenta");
                break;
            case 6:
                System.out.print("Sesenta");
                break;
            case 7:
                System.out.print("Setenta");
                break;
            case 8:
                System.out.print("Ochenta");
                break;
            case 9:
                System.out.print("Noventa");
                break;
        }


        if (decenas != 1 && decenas != 2 || (decenas == 2 && unidades != 0)) {
            if (decenas > 2 && unidades > 0) {
                System.out.print(" y ");

            }

            switch (unidades) {
                case 0:
                    if (decenas == 0) System.out.print("Cero");
                    break;
                case 1:
                    System.out.print("Uno");
                    break;
                case 2:
                    System.out.print("Dos");
                    break;
                case 3:
                    System.out.print("Tres");
                    break;
                case 4:
                    System.out.print("Cuatro");
                    break;
                case 5:
                    System.out.print("Cinco");
                    break;
                case 6:
                    System.out.print("Seis");
                    break;
                case 7:
                    System.out.print("Siete");
                    break;
                case 8:
                    System.out.print("Ocho");
                    break;
                case 9:
                    System.out.print("Nueve");
                    break;
            }
        }

        System.out.println();

    }
}
