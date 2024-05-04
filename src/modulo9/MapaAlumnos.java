package modulo9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapaAlumnos {

    public static void main(String[] args) {
        Map<Integer, Alumno> diccionarioAlumnos = new HashMap();

        // Cargar alumnos
        diccionarioAlumnos.put(101, new Alumno("Juan", 101, 3.5));
        diccionarioAlumnos.put(102, new Alumno("María", 102, 4.2));
        diccionarioAlumnos.put(103, new Alumno("Pedro", 103, 3.9));
        diccionarioAlumnos.put(104, new Alumno("Ana", 104, 4.8));
        diccionarioAlumnos.put(105, new Alumno("Carlos", 105, 2.7));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el legajo del alumno a buscar (o -1 para salir): ");
        int legajo = Integer.parseInt(scanner.nextLine());

        while (legajo != -1) {

            Alumno alumno = diccionarioAlumnos.get(legajo);

            if (alumno != null) {
                System.out.println("Información del alumno:");
                System.out.println("Nombre: " + alumno.getNombre());
                System.out.println("Legajo: " + alumno.getLegajo());
                System.out.println("Nota de Cursada: " + alumno.getNotaCursada());
            } else {
                System.out.println("Alumno no encontrado.");
            }

            System.out.print("Ingresa el legajo del alumno a buscar (o -1 para salir): ");
            legajo = Integer.parseInt(scanner.nextLine());

        }
    }
}
