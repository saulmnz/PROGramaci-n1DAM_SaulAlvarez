import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println(ContarPalabra("Saul"));

    }
    public static int ContarPalabra(String PalabraClave){
        int contador = 0;

        try(BufferedReader br = new BufferedReader(new FileReader("Notas.txt"))){
            String linea;
            while ((linea= br.readLine())!=null){
                String [] pedazos = linea.split(" ");
                for (int i = 0; i<pedazos.length;i++){
                    String pedazo = pedazos[i].toLowerCase();
                    if (pedazo.equals(PalabraClave.toLowerCase())){
                        contador++;

                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return contador;
    }
}
