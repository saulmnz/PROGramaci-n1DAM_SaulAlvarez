

package Ejercicio11;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Map<Character,Academico> academia = new HashMap<>();
        Academico academico0 = new Academico("Abel del Sn",2012);
        Academico academico1 = new Academico("Ana de la rosa",2000);
        Academico academico2 = new Academico("Jorge de la piedra",2001);
        nuevoAcademico(academia,academico0,'Z');
        if (nuevoAcademico(academia,academico1,'S')) {
            System.out.println("Academico añadido");
        }
        nuevoAcademico(academia,academico2,'R');
        System.out.println(academia);
        List<Academico> academicos = new ArrayList<>(List.copyOf(academia.values()));
        List<Map.Entry<Character, Academico>> academicosOrdenLetra = new ArrayList<>(academia.entrySet());
        System.out.println(academicosOrdenLetra);
        academicosOrdenLetra.sort(new Comparator<>() { // Aqui he ordenado un poco con un batiburrilo de los criterios
            @Override
            public int compare(Map.Entry<Character, Academico> characterAcademicoEntry, Map.Entry<Character, Academico> t1) {
                int letraPA = (int) characterAcademicoEntry.getKey();
                int nombreFechaPA = obtenerNumeroNombre(characterAcademicoEntry.getValue().nome) + characterAcademicoEntry.getValue().anoIngreso;
                int letraT1 = (int) t1.getKey();
                int PA = letraPA + nombreFechaPA;
                int nombreFechaT1 = obtenerNumeroNombre(t1.getValue().nome) + t1.getValue().anoIngreso;
                int resultT1 = letraT1 + nombreFechaT1;
                return Integer.compare(PA,resultT1);
            }
        });
        System.out.println(academicosOrdenLetra);
        System.out.println(academicos);
        academicos.sort(new Comparator<>() {
            @Override
            public int compare(Academico academico, Academico t1) {
                int nomNum1 = obtenerNumeroNombre(academico.nome);
                int nomNum2 = obtenerNumeroNombre(t1.nome);
                int num1 = academico.anoIngreso + nomNum1;
                int num2 = t1.anoIngreso + nomNum2;
                return Integer.compare(num1, num2);
            }

        });
        System.out.println("Despues de aplicar el orden por nombre y años sin letras");
        System.out.println(academicos);
    }


    static boolean nuevoAcademico (Map<Character, Academico> academia, Academico novo, Character letra) {
        letra = Character.toUpperCase(letra);
        if (academia!=null && Character.isLetter(letra)) {
            academia.put(letra,novo);
            return true;
        }
        return false;
    }
    static private int obtenerNumeroNombre(String nombre) {
        int numNombre = 0;
        if (nombre!=null) {
            nombre = nombre.strip().trim();
            for (int i = 0; i < nombre.length(); i++) {
                if (Character.isWhitespace(nombre.charAt(i))) continue;
                numNombre += nombre.charAt(i);
            }
        }
        return numNombre;
    }
}
