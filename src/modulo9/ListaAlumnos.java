package modulo9;

import java.util.ArrayList;
import java.util.List;

public class ListaAlumnos {

    public static void main(String[] args) {
        //
        List<Alumno> listaAlumnos = new ArrayList<>();

        // Agregar alumnos a la lista
        listaAlumnos.add(new Alumno("Juan", 101, 3.5));
        listaAlumnos.add(new Alumno("María", 102, 4.2));
        listaAlumnos.add(new Alumno("Pedro", 103, 3.9));
        listaAlumnos.add(new Alumno("Ana", 104, 4.8));
        listaAlumnos.add(new Alumno("Carlos", 105, 2.7));

        // Mostrar todos los alumnos en pantalla
        System.out.println("Todos los alumnos:");
        for (Alumno alumno : listaAlumnos) {
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Legajo: " + alumno.getLegajo());
            System.out.println("Nota de Cursada: " + alumno.getNotaCursada());
            System.out.println();
        }

        // Mostrar solo los alumnos con nota igual o superior a 4
        System.out.println("Alumnos con nota igual o superior a 4:");
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNotaCursada() >= 4.0) {
                System.out.println("Nombre: " + alumno.getNombre());
                System.out.println("Legajo: " + alumno.getLegajo());
                System.out.println("Nota de Cursada: " + alumno.getNotaCursada());
                System.out.println();
            }
        }
    }

}
