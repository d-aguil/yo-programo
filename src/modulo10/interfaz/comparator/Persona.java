package modulo10.interfaz.comparator;

import java.util.Comparator;

public class Persona implements Comparator<Persona>{
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

    public static Comparator<Persona> ordenPorNombreYEdad(Persona persona1, Persona persona2){
        return new Comparator<Persona>() {
            @Override
            public int compare(Persona persona, Persona t1) {
                int comparacionNombre = persona1.getNombre().compareToIgnoreCase(persona2.getNombre());

                if (comparacionNombre == 0) {
                    return -Integer.compare(persona1.getEdad(), persona2.getEdad());
                } else {
                    return comparacionNombre;
                }

            }
        };
    }

    @Override
    public int compare(Persona persona, Persona t1) {
        return 0;
    }
}
