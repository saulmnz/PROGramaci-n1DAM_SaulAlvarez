import java.sql.SQLOutput;
import java.util.Arrays;

/*

Boletín 8.2. String

1 .Escribir funcións que dada unha cadena de caracteres:

Imprima os dous primeiros caracteres.

Imprima os tres últimos caracteres.

Imprima dita cadea cada dous caracteres. Ex.: recta debería imprimir rca

Imprima a cadea nun sentido e en sentido inverso. Ex: reflexo imprime reflexooxelfer.


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


2. Escribir funcións que dada unha cadea e un caracter:

Inserte o caracter entre cada letra da cadea. Ex: separar e ‘,’ debería devolver s,e,p,a,r,a,r

Reemplace tódolos espazos polo caracter. Ex: ‘meu arquivo de texto.txt’ e ‘\_’ debería devoltar ‘meu\_arquivo\_de\_texto.txt’

Reemplace tódolos díxitos na cadea polo caracter. Ex: súa clave é: 1540 e ‘X’ debería devotar súa clave é: XXXX

Inserte o caracter cada 3 díxitos na cadea. Ex. 2552552550 e ‘.’ debería devoltar 255.255.255.0


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


3. Modificar as funcións anteriores, para que reciban un parámetro que indique a cantidade máxima de reemplazos ou insercións a realizar.


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


4. Escribir unha función que reciba unha cadea que conten un número entero longo e devolte unha cadea co número e as separacións de miles. Por exemplo, se recibe 1234567890, debe devoltar 1.234.567.890.


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


5. Escribir unha función que dada unha cadea de caracteres, devolte:

A primeira letra de cada palabra. Por exemplo, 	si recibe Universal Serial Bus debe devoltar USB.

Unha cadea coa primeira letra de cada palabra en maiúsculas. Por exemplo, se recibe república arxentina, debe devoltar, República Argentina.

As palabras que comecen coa letra A. Por exemplo, si recibe Antes de abrir, debe devoltar, Antes abrir.


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


6. Escribir funcións que dada unha cadea de caracteres:

Devolva soamente as letras consonantes. Por exemplo, se recibe ‘algoritmos’ ou ‘logaritmos’ debe devolver ‘lgrtms’.

Devolva soamente as letras vogais. Por exemplo, se recibe ‘sen 	consonantes’ debe devoltar ‘e ooae’.

Substitúa cada vogal pola súa seguinte vogal. Por exemplo, se recibe ‘vestiario’ debe devoltar ‘vostoerou’.

Indique si se trata dun palíndromo. Por exemplo, ‘anita lava la tina’ é un palíndromo (léese igual de esquerda 	a dereita que de dereita a esquerda).


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


7. Escribir funcións que dadas dúas cadeas de caracteres:

Indique si a segunda cadea é unha subcadea da primeira. Por exemplo, ‘cadea’ é unha subcadea de ‘subcadea’.

Devolva a que sexa anterior en orden alfábetico. Por exemplo, se recibe ‘kde' e ‘gnome’ debe devoltar ‘gnome’.


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


8. Escribir unha función que reciba unha cadea de uns e ceros (é dicir, un número en representación binaria) e devolte o valor decimal correspondente.


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


9. Escribir as seguintes funcións que fagan o seguinte:

Recibindo unha cadea de caracteres e un caracter, retorne unha nova cadea formada exclusivamente polo novo caracter. Esta nova cadea tera a lonxitude da cadea pasada por parámetro.

Recibindo unha cadea de caracteres e un caracter, a función terá que comprobar si o caracter está na cadea. A función retornará un String no que aparezan guións e o caracter na posición ou posicións onde coincida na cadea.


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


10. Escribe a función que permita validar un contasinal, recibindo o contrasinal como parámetro. O contrasinal ten que cumprir as condicións de mínimo 8 caracteres, o menos unha maiúscula, unha minúscula e un número. A función ten que retornar un booleano especificando si é válida ou non.


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


11. Escribe a función que permita formatear de nomes. A función ten que eliminar os espazos en branco e poñer en maiúsculas o primeiro caracter d o nome e apelido pasado como parámetro. Finalmente retornará unha cadea co nome e apelidos co formato solicitado.


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


12. Crear a función que permíta realizar un analisis simple de texto. O analizador ten  a función de contar palabras, caracteres e encontrar a palabra mais longa. Mostrar os resultados por pantalla.

*/

    public class Ejercicios {
        public static void main(String[] args) {
            ej1apartadoA();
            ej1apartadoB();
            ej1apartadoC();
            ej1apartadoD();

            ej2ApartadoA();
            ej2ApartadoB();
            ej2ApartadoC();
            ej2ApartadoD();

            ej3ApartadoA(2);
            ej3ApartadoB(1);
            ej3ApartadoC(2);
            //ej3ApartadoD(1);

            ej4();

            ej5ApartadoA();
            ej5ApartadoB();
            ej5ApartadoC();

            ej6ApartadoA();
            ej6ApartadoB();
            ej6ApartadoC();
            ej6ApartadoD();

            ej7ApartadoA();
            ej7ApartadoB();

            ej8();

            ej9ApartadoA("$");
            ej9ApartadoB();

            ej10("Password");

            ej11();

            ej12();
        }

        public static void ej1apartadoA() {
            //Apartado A Imprime los dos primeros caracteres
            String palabra = "reflejo";
            String apartadoA = palabra.substring(0, 1);
            System.out.println("EJ 1 Apartado A");
            System.out.println("Dos primeros caracteres " + apartadoA);
            System.out.println();

        }

        public static void ej1apartadoB() {
            //Apartado B Imprime los tres primeros
            String palabra = "reflejo";
            String apartadoB = palabra.substring(palabra.length() - 3);
            System.out.println("EJ 1 Apartado B");
            System.out.println("Tres últimos caracteres " + apartadoB);
            System.out.println();

        }

        public static void ej1apartadoC() {
            //Apartado C Imprime cada dos caracteres
            String palabra = "reflejo";
            System.out.println("EJ 1 Apartado C");
            for (int i = 0; i < palabra.length(); i += 2) {
                System.out.print(palabra.charAt(i));
            }
            System.out.println();
        }

        public static void ej1apartadoD() {
            //Apartado D Imprime reflejo
            System.out.println();
            System.out.println("EJ 1 Apartado D");
            String palabra = "reflejo";
            String invertido = "";

            for (int i = palabra.length() - 1; i >= 0; i--) {
                invertido += palabra.charAt(i);
            }

            String concatenado = palabra.concat(invertido);
            System.out.println(concatenado);
            System.out.println();

        }

        public static void ej2ApartadoA() {

            System.out.println("EJ 2 Apartado A");
            String ej2 = "separar";
            String comas = "";
            for (int i = 0; i < ej2.length(); i++) {

                if (i < ej2.length() - 1) {
                    comas += ej2.charAt(i) + ",";
                } else {
                    comas += ej2.charAt(i);
                }

            }

            System.out.println(comas);

        }

        public static void ej2ApartadoB() {
            System.out.println();
            System.out.println("EJ 2 Apartado B");
            String ej2B = "mew arquivo de texto.txt";
            String cambiar = ej2B.replace(" ", "/_");
            System.out.println(cambiar);
        }

        public static void ej2ApartadoC() {
            System.out.println();
            System.out.println("EJ 2 Apartado C");
            String clave = "A sua clave é = 1540";
            String remplazar = clave.replace("1540", "XXXX");
            System.out.println(remplazar);
        }

        public static void ej2ApartadoD() {
            System.out.println();
            System.out.println("EJ 2 Apartado D");
            String ip = "2552552550";
            String puntos = "";
            for (int i = 0; i < ip.length(); i += 3) {
                if (i < ip.length() - 1) {
                    puntos += ip.charAt(i);
                    puntos += ip.charAt(i + 1);
                    puntos += ip.charAt(i + 2) + ".";

                } else {
                    puntos += ip.charAt(i);
                }

            }
            System.out.println(puntos);

        }

        public static void ej3ApartadoA(int remplazos) {
            System.out.println();
            System.out.println("Ejercicio 3 Apartado A");
            String ej3A = "separar";
            String comas = "";

            for (int i = 0; i < ej3A.length(); i++) {

                if (i < ej3A.length() - 1 && remplazos != 0) {
                    comas += ej3A.charAt(i) + ",";
                    remplazos--;
                } else {
                    comas += ej3A.charAt(i);
                }
            }
            System.out.println(comas);
        }

        public static void ej3ApartadoB(int remplazos) {

            System.out.println();
            System.out.println("EJ 3 Apartado B");
            String ej3B = "mew arquivo de texto.txt";
            StringBuilder cambiar = new StringBuilder(ej3B);

            for (int i = 0; i < cambiar.length(); i++) {
                if (cambiar.charAt(i) == ' ' && remplazos != 0) {
                    cambiar.replace(i, i + 1, "/_");
                    remplazos--;
                }
            }
            System.out.println(cambiar.toString());
        }

        public static void ej3ApartadoC(int remplazos) {
            System.out.println();
            System.out.println("EJ 3 Apartado C");
            String clave = "A sua clave é = 1540";
            StringBuilder nuevo = new StringBuilder();
            for (int i = 0; i < clave.length(); i++) {
                if (Character.isDigit(clave.charAt(i)) && remplazos != 0) {
                    nuevo.append("X");
                    remplazos--;
                } else {
                    nuevo.append(clave.charAt(i));
                }
            }
            System.out.println(nuevo.toString());
        }

        public static void ej3ApartadoD(int remplazos) {
            System.out.println();
            System.out.println("EJ 3 Apartado D");
            String ip = "2552552550";
            StringBuilder ipPuntos = new StringBuilder(ip);
            for (int i = 0; i < ip.length(); i += 3) {

                ipPuntos.append(ip.charAt(i));
                ipPuntos.append(ip.charAt(i + 1));
                ipPuntos.append(ip.charAt(i + 2));

                if (i < ip.length() && remplazos != 0) {

                    ipPuntos.append(".");
                    remplazos--;
                }
            }
            System.out.println(ipPuntos.toString());

        }

        public static void ej4() {
            System.out.println();
            System.out.println("EJ 4");
            String cadenaNumeros = "1200400500";
            StringBuilder nuevaCadenaNumeros = new StringBuilder();
            int contador = 0;
            for (int i = cadenaNumeros.length() - 1; i >= 0; i--) {
                nuevaCadenaNumeros.append(cadenaNumeros.charAt(i));
                contador++;                                             // se acumula contaodr
                if (contador == 3 && i != 0) {                              // al llegar a 3 el contador
                    nuevaCadenaNumeros.append(".");                      // añade un punto
                    contador = 0;                                          // se resetea para que vuelva a contar hasta 3
                }
            }
            System.out.println(nuevaCadenaNumeros.reverse().toString());

        }


        public static void ej5ApartadoA() {

            System.out.println();
            System.out.println("EJ 5 Apartado A");

            String primerasLetras = "Universal Serial Bus";
            String[] primeras = primerasLetras.split(" ");
            StringBuilder abreviar = new StringBuilder();

            for (String palabra : primeras) {
                abreviar.append(palabra.charAt(0));
            }
            System.out.println("Primera letra de cada palabra: " + abreviar.toString());


        }

        public static void ej5ApartadoB() {

            System.out.println();
            System.out.println("EJ 5 Apartado B");

            String cadena = "república argentina";
            String[] primerasMayus = cadena.split(" ");
            StringBuilder mayus = new StringBuilder();

            for (String frase : primerasMayus) {
                mayus.append(frase.substring(0, 1).toUpperCase());
                mayus.append(frase.substring(1).toLowerCase());
                mayus.append(" ");

            }
            System.out.println(mayus.toString().trim());

        }

        public static void ej5ApartadoC() {
            System.out.println();
            System.out.println("EJ 5 Apartado C");

            String abrir = "Antes de abrir";
            String[] letrasA = abrir.split(" ");

            StringBuilder a = new StringBuilder();
            for (String frase : letrasA) {
                if (frase.startsWith("a") || frase.startsWith("A")) {
                    a.append(frase).append(" ");
                }
            }


            System.out.println("Palabras que empiezan por la letra A = " + a.toString().trim());


        }

        public static void ej6ApartadoA() {
            System.out.println();
            System.out.println("EJ 6 Apartado A");

            String cadena = "algoritmos";
            StringBuilder consonantes = new StringBuilder();
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) != 'a' && cadena.charAt(i) != 'e' && cadena.charAt(i) != 'i' && cadena.charAt(i) != 'o' && cadena.charAt(i) != 'u') {
                    consonantes.append(cadena.charAt(i));
                }
            }
            System.out.println(consonantes.toString());
        }

        public static void ej6ApartadoB() {
            System.out.println();
            System.out.println("EJ 6 Apartado B");

            String cadena = "consonantes";
            StringBuilder vocales = new StringBuilder();

            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
                    vocales.append(cadena.charAt(i));
                }
            }
            System.out.println(vocales.toString());
        }

        public static void ej6ApartadoC() {
            System.out.println();
            System.out.println("EJ 6 Apartado C");

            String cadena = "vestiario";
            StringBuilder resultado = new StringBuilder();

            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == 'a') {
                    resultado.append('e');
                } else if (cadena.charAt(i) == 'e') {
                    resultado.append('i');
                } else if (cadena.charAt(i) == 'i') {
                    resultado.append('o');
                } else if (cadena.charAt(i) == 'o') {
                    resultado.append('u');
                } else if (cadena.charAt(i) == 'u') {
                    resultado.append('a');
                } else {
                    resultado.append(cadena.charAt(i));
                }
            }
            System.out.println(resultado.toString());
        }

        public static void ej6ApartadoD (){
            System.out.println();
            System.out.println("EJ 6 Apartado D");
            String cadena = "anita lava la tina";

            // Eliminar espacios y convertir a minúsculas
            String cadenaLimpia = cadena.replaceAll("\\s+", "").toLowerCase(); //\\S son espacios en blanco

            // Crear una cadena inversa
            StringBuilder cadenaInvertida = new StringBuilder(cadenaLimpia).reverse();

            if (cadenaLimpia.equals(cadenaInvertida.toString())) {
                System.out.println("Es un palíndromo.");
            } else {
                System.out.println("No es un palíndromo.");
            }
        }

        public static void ej7ApartadoA (){

            System.out.println();
            System.out.println("EJ 7 Apartado A");

            String cadea = "cadea";
            String subcadea = "subcadea";
            System.out.println("Contiene la palabra = "+ subcadea+" a la cadena = "+cadea+"??");
            System.out.println("Resultado = " + subcadea.contains(cadea));

        }

        public static void ej7ApartadoB (){
            System.out.println();
            System.out.println("Ej 7 Apartado A");
            String cadea = "kde";
            String cadea2 = "gnome";
            System.out.println("Devolverá la cadena que sea anterior algabeticamente :");

            if (cadea.compareTo(cadea2) < 0) {
                System.out.println(cadea);  // Si cadena1 es anterior en orden alfabético
            } else {
                System.out.println(cadea2);  // Si cadena2 es anterior en orden alfabético
            }
        }

        public static void ej8 (){
            System.out.println();
            System.out.println("Ej 8 ");

            String binario = "10010101010";

            int decimal = Integer.parseInt(binario,2);
            System.out.println("Valor decimal de "+binario+" es: "+ decimal);
        }


        public static void ej9ApartadoA(String caracter) {
            System.out.println();
            System.out.println("EJ 9 Apartado A");

            String cadena = "ejemplo";


            // Crear una nueva cadena del mismo tamaño, pero con el caracter proporcionado
            StringBuilder nuevaCadena = new StringBuilder(cadena.length());
            for (int i = 0; i < cadena.length(); i++) {
                nuevaCadena.append(caracter);
            }

            System.out.println("Nueva cadena: " + nuevaCadena.toString());
        }

        public static void ej9ApartadoB() {
            System.out.println();
            System.out.println("EJ 9 Apartado B");

            String cadena = "programacion";
            char caracter = 'o';

            // Crear una cadena con guiones donde el caracter se encuentra
            StringBuilder resultado = new StringBuilder();
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == caracter) {
                    resultado.append(caracter);
                } else {
                    resultado.append('-');
                }
            }

            System.out.println("Resultado: " + resultado.toString());
        }

        public static void ej10(String contrasinal) {
            System.out.println();
            System.out.println("EJ 10");


            // Validar el contrasinal
            boolean esValido = contrasinal.length() >= 8
                    && contrasinal.matches(".*[A-Z].*")  // Contiene al menos una mayúscula
                    && contrasinal.matches(".*[a-z].*")  // Contiene al menos una minúscula
                    && contrasinal.matches(".*\\d.*");   // Contiene al menos un número

            if (esValido) {
                System.out.println("El contrasinal es válido.");
            } else {
                System.out.println("El contrasinal no es válido.");
            }
        }

        public static void ej11() {
            System.out.println();
            System.out.println("EJ 11");

            String nombreApellido = "  juan perez  ";

            // Eliminar espacios y poner en mayúsculas la primera letra de cada palabra
            String[] partes = nombreApellido.trim().split(" ");
            StringBuilder resultado = new StringBuilder();

            for (String parte : partes) {
                if (!parte.isEmpty()) {
                    resultado.append(parte.substring(0, 1).toUpperCase())
                            .append(parte.substring(1).toLowerCase())
                            .append(" ");
                }
            }

            System.out.println("Nombre y apellido formateado: " + resultado.toString().trim());
        }

        public static void ej12() {
            System.out.println();
            System.out.println("EJ 12");

            String texto = "Este es un ejemplo de analisis de texto";

            // Dividir el texto en palabras
            String[] palabras = texto.split("\\s+");

            // Contar palabras y caracteres
            int numPalabras = palabras.length;
            int numCaracteres = texto.replace(" ", "").length(); // Eliminar espacios para contar caracteres

            // Encontrar la palabra más larga
            String palabraMasLarga = "";
            for (String palabra : palabras) {
                if (palabra.length() > palabraMasLarga.length()) {
                    palabraMasLarga = palabra;
                }
            }

            System.out.println("Número de palabras: " + numPalabras);
            System.out.println("Número de caracteres: " + numCaracteres);
            System.out.println("Palabra más larga: " + palabraMasLarga);
        }



    }






