package modulo9;

public class Programa {

    public static void main(String[] args) {

        //
        Vehiculo vehiculo;

        //
        vehiculo = new Vehiculo("AA-001-AA", "renault", "capture", "gris");

        //
        vehiculo.setColor("negro");

        //
        System.out.println("El color del vehículo es: "+vehiculo.getColor());
    }
}
