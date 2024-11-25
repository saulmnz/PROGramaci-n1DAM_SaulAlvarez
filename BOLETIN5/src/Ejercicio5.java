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
