package modulo9;

import java.util.ArrayList;
import java.util.List;

public class ListaNombres {

    public static void main(String[] args) {
        List<String> nombresAlumnos = new ArrayList();

        // Agregar nombres de alumnos a la lista
        nombresAlumnos.add("Juan");
        nombresAlumnos.add("María");
        nombresAlumnos.add("Pedro");
        nombresAlumnos.add("Ana");
        nombresAlumnos.add("Carlos");

        // Mostrar todos los nombres de alumnos en pantalla
        System.out.println("Todos los nombres de alumnos:");
        for (String nombre : nombresAlumnos) {
            System.out.println(nombre);
        }

        // Mostrar solo los nombres de alumnos que comienzan con "A"
        System.out.println("\nNombres de alumnos que comienzan con 'A':");
        for (String nombre : nombresAlumnos) {
            if (nombre.startsWith("A") || nombre.startsWith("a")) {
                System.out.println(nombre);
            }
        }
    }
}
