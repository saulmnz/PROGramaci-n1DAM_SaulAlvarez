/*
 * Boletín 6 Ejercicio 5
 * @version 1.1
 * @author SAUL ALVAREZ MONZON
 */
public class Ejercicio5 {
    public static void main(String[] args) {

        String texto = "java java java";
        String sinespacios = texto.replace(" ","");
        char letra;
        int contadorvocales = 0;
        int contadorconsonantes =0;

        for (int i = 0; i < sinespacios.length();i++){
            letra = Character.toLowerCase(sinespacios.charAt(i));
            if (letra == 'a' || letra == 'e' || letra =='i' || letra == 'o' || letra== 'u'){
                contadorvocales ++;
            } else {
                contadorconsonantes++;
            }
        }
        System.out.println("La cantidad de vocales es = "+contadorvocales+" y la canntidad de consonantes es = "+contadorconsonantes);


    }
}
