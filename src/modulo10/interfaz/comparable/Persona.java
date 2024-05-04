package modulo10.interfaz.comparable;

import java.util.Comparator;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int compareTo(Persona o) {

        return this.nombre.compareTo(o.nombre);
    }
}
