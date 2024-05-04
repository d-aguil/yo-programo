package modulo9;

public class Objetos {

    public static void main(String[] args) {

        //creo un objeto
        Vehiculo vehiculoA = new Vehiculo();

        //creo un objeto
        Vehiculo vehiculoB = new Vehiculo();

        //asigno la dirección donde reside vehiculoA
        Vehiculo vehiculoC = vehiculoA;

        //comparación de las áreas donde residen
        System.out.println("Los objetos son iguales = " + (vehiculoA == vehiculoB));

        //comparación de los objetos
        System.out.println("Los objetos son iguales = " + (vehiculoA.equals(vehiculoB)) );

        //comparación
        System.out.println("Los objetos son iguales = " + (vehiculoA == vehiculoC) );
        System.out.println("Los objetos son iguales = " + (vehiculoA.equals(vehiculoC)) );

    }
}
