package modulo10.interfaz.comparator;

import modulo10.interfaz.comparator.Persona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaPersonas {
    public static void main(String[] args) {

        //
        List<Persona> lista = new ArrayList();

        //
        Persona p1 = new Persona("Juan", 20);
        Persona p2 = new Persona("María", 19);
        Persona p3 = new Persona("Ana", 25);

        //
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        //usando lambda
        lista.sort((persona1, persona2) -> {
            int comparacionNombre = persona1.getNombre().compareToIgnoreCase(persona2.getNombre());

            if (comparacionNombre == 0) {
                return -Integer.compare(persona1.getEdad(), persona2.getEdad());
            } else {
                return comparacionNombre;
            }
        });

        Collections.sort(lista, new OrdenXEdad());

        //
        for (Persona p: lista) {
            System.out.println(p.getNombre() + " - " +
                    p.getEdad());
        }
    }
}
