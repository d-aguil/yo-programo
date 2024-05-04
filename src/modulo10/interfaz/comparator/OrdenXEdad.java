package modulo10.interfaz.comparator;

import java.util.Comparator;

public class OrdenXEdad implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getEdad() - p2.getEdad();
    }
}
