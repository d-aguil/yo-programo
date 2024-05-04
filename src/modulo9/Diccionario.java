package modulo9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Diccionario {

    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap();

        // Cargar palabras con sus traducciones
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("coche", "car");
        diccionario.put("libro", "book");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra en español (o 'salir' para finalizar): ");
        String palabra = scanner.nextLine();

        while (palabra != "salir") {

            String traduccion = diccionario.get(palabra);

            if (traduccion != null) {
                System.out.println("La traducción al inglés es: " + traduccion);
            } else {
                System.out.println("La palabra no está en el diccionario.");
            }

            System.out.print("Ingresa una palabra en español (o 'salir' para finalizar): ");
            palabra = scanner.nextLine();
        }
    }
}
