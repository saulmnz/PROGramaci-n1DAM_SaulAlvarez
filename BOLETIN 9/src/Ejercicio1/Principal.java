package Ejercicio1;
public class Principal {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setTitulo("Cien años de soledad");
        libro1.setAutor("Gabriel García Márquez");
        libro1.setAno(1967);
        libro1.setNumPaginas((short) 432);
        libro1.setValoracion(4.8f);

        Libro libro2 = new Libro("1984", "George Orwell", 1949, (short) 328);

        System.out.println("** Libro 1 **");
        libro1.amosar();
        System.out.println("\n** Libro 2 **");
        libro2.amosar();
    }
}
