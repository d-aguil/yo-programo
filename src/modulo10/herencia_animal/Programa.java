package modulo10.herencia_animal;

import java.util.ArrayList;
import java.util.List;

public class Programa {

    //
    public static void main(String[] args) {

        Perro miPerro = new Perro("Charo", 10, "Labrador");
        Gato miGato = new Gato("Viktor", 3, 7);

        //
        miPerro.comer();
        miPerro.ladrar();

        //
        miGato.dormir();
        miGato.maullar();
    }

    public static void mascotas() {

        Perro miPerro = new Perro("Charo", 10, "Labrador");
        Gato miGato = new Gato("Viktor", 3, 7);

        //
        List<Animal> misMascotas = new ArrayList<>();

        //
        misMascotas.add(miPerro);
        misMascotas.add(miGato);

        //
        for (Animal animal : misMascotas) {
            //
            animal.comer();
            animal.dormir();
        }
    }

    //
    public static void main_2(String[] args) {

        Animal miPerro = new Perro("Charo", 10, "Labrador");
        Animal miGato = new Gato("Viktor", 3, 7);

        //
        miPerro.comer();
        ((Perro)miPerro).ladrar();

        //
        miGato.dormir();
        ((Gato)miGato).maullar();
    }
}
