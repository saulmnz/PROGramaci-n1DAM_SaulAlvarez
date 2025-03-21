public class Ejercicio1 {

    public static String[] dividirEnSecuencias(String palabra, int n) {
        if (palabra == null || n <= 0 || n > palabra.length()) {
            return new String[0];
        }

        int cantidadSecuencias = palabra.length() - n + 1;
        String[] secuencias = new String[cantidadSecuencias];

        for (int i = 0; i < cantidadSecuencias; i++) {
            secuencias[i] = palabra.substring(i, i + n);
        }

        return secuencias;
    }

    // Método main para prueba
    public static void main(String[] args) {
        String palabra = "frigorífico";
        int n = 4;
        String[] resultado = dividirEnSecuencias(palabra, n);

        for (String secuencia : resultado) {
            System.out.println(secuencia);
        }
    }
}