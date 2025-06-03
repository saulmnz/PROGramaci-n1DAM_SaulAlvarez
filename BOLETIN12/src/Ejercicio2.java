import java.io.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Busqueda");
        palabraClave("Saul");
    }
    public static void leerNotas(){
        try (BufferedReader br = new BufferedReader(new FileReader("Notas.txt"))) {
            String linea;
            while((linea= br.readLine())!=null){
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
    }
    public static void añadirNotas(String texto){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Notas.txt", true))) {
            bw.append("\n").append(texto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
    }
    public static void palabraClave(String PalabraClave){
        try (BufferedReader br = new BufferedReader(new FileReader("Notas.txt"))) {
            String linea;
            while((linea=br.readLine())!=null){
                String [] pedazos = linea.split(" ");

                for (int i = 0; i< pedazos.length;i++){
                    String pedazo = pedazos[i];
                    if (pedazo.equals(PalabraClave)){
                        System.out.println(linea);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
