public class Ejercicio2 {

    public static String generarHtml(String contenido) {
        if (contenido == null) {
            contenido = "";
        }

        int indiceSaltoLinea = contenido.indexOf('\n');
        String titulo;
        String texto;

        if (indiceSaltoLinea == -1) {
            titulo = contenido;
            texto = "";
        } else {
            titulo = contenido.substring(0, indiceSaltoLinea);
            texto = contenido.substring(indiceSaltoLinea + 1);
        }

        // Escapar caracteres especiales para HTML
        titulo = titulo.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;");
        texto = texto.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;");

        StringBuilder html = new StringBuilder();
        html.append("<!DOCTYPE html>\n")
                .append("<html>\n")
                .append("<head>\n")
                .append("<meta charset=\"UTF-8\">\n")
                .append("<title>").append(titulo).append("</title>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h1>").append(titulo).append("</h1>\n")
                .append("<p>").append(texto).append("</p>\n")
                .append("</body>\n")
                .append("</html>");

        return html.toString();
    }

    // Método main para prueba
    public static void main(String[] args) {
        String entrada = "Título de la página\nEste es el contenido de la página web.";
        String html = generarHtml(entrada);
        System.out.println(html);
    }
}