package modulo9;

import java.util.ArrayList;
import java.util.List;

public class ListaVehiculos {

    //
    public static void mostrarEnPantalla(List<Vehiculo>  vehiculos){

        //
        for (Vehiculo vehiculo : vehiculos) {

            //
            vehiculo.mostrarDatos();
        }
    }

    public static void main(String[] args) {

        //
        List<Vehiculo> vehiculos = new ArrayList();

        //
        vehiculos.add(new Vehiculo("AA-001-AA","renault","capture","gris"));
        vehiculos.add(new Vehiculo("AA-002-AA","fiat","punto","rojo"));
        vehiculos.add(new Vehiculo("AA-003-AA","audi","q8","blanco"));

        //
        mostrarEnPantalla(vehiculos);
    }

    public static void manipulandoObjetos() {

        //
        List<Vehiculo> vehiculos = new ArrayList();

        //
        vehiculos.add(new Vehiculo("AA-001-AA","renault","capture","gris"));

        //
        Vehiculo v = new Vehiculo("AA-002-AA","fiat","punto","rojo");

        //
        vehiculos.add(v);

        //
        vehiculos.add(new Vehiculo("AA-003-AA","audi","q8","blanco"));

        //
        mostrarEnPantalla(vehiculos);

        //
        v.setColor("negro");

        //
        mostrarEnPantalla(vehiculos);

    }
}
