package modulo9;
import sun.misc.Unsafe;


public class VehiculoAtributos {

    public static void main(String[] args) {

        Vehiculo autoToyota = new Vehiculo("xx-123-zz", "toyota","etios","verde" );

        Vehiculo autoFiat = new Vehiculo("xx-123-zz", "toyota","yaris","verde" );

        Vehiculo auto1= new Vehiculo("xx-123-zz", "toyota","etios","verde");
        Vehiculo auto2 = new Vehiculo("xx-123-zz", "toyota","etios","verde");

        if ( auto1.equals(auto2) ) {

            System.out.println("autos IGUALES...");

        } else {

            System.out.println("autos DISTINTOS...");
        }

        if ( autoToyota.equals(autoFiat) ) {

            System.out.println("IGUALES...");

        } else {

            System.out.println("DISTINTOS...");
        }

        /*if ( autoToyota.getPatente()      == autoFiat.getPatente()
                && autoToyota.getMarca()  == autoFiat.getMarca()
                && autoToyota.getModelo() == autoFiat.getModelo()
                && autoToyota.getColor()  == autoFiat.getColor()  ){

            System.out.println("IGUALES...");

        } else {

            System.out.println("DISTINTOS...");
        }*/
    }
}
