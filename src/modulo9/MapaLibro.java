package modulo9;

import java.util.HashMap;
import java.util.Map;

public class MapaLibro {

    public static void main(String[] args) {

        //
        Map<String, Libro> libros = new HashMap();

        Libro libro1 = new Libro("El Hobbit", "J.R.R. Tolkien", 1937, "978-84-450-7112-3");
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "978-84-376-0494-7");
        Libro libro3 = new Libro("1984", "George Orwell", 1949, "978-84-261-3017-2");
        Libro libro4 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605, "978-84-376-0494-7");

        libros.put(libro1.getIsbn(), libro1);
        libros.put(libro2.getIsbn(), libro2);
        libros.put(libro3.getIsbn(), libro3);
        libros.put(libro4.getIsbn(), libro4);


    }
}
