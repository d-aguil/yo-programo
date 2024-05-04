package modulo10.interfaz.comparable;

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

        //
        Collections.sort(lista);
        //Collections.reverse(lista);

        //
        for (Persona p: lista) {
            System.out.println(p.getNombre() + " - " +
                    p.getEdad());
        }
    }
}
