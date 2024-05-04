package modulo9;

public class VehiculosIguales {

    public static void main(String[] args) {

        //
        Vehiculo autoA = new Vehiculo();

        //
        autoA.setPatente("AA-123-XX");

        //
        Vehiculo autoB = new Vehiculo();

        //
        autoB.setPatente("AA-123-XX");

        //USO INCORRECTO
        if(autoA == autoB){
            System.out.println("SON IGUALES");
        }else{
            System.out.println("SON DIFERENTES");
        }

        //USO CORRECTO Sólo por como funcionan los string's en java
        if(autoA.getPatente() == autoB.getPatente()){
            System.out.println("SON IGUALES");
        }else{
            System.out.println("SON DIFERENTES");
        }

        //USO CORRECTO
        if(autoA.getPatente().equals(autoB.getPatente())){
            System.out.println("SON IGUALES");
        }else{
            System.out.println("SON DIFERENTES");
        }
    }
}
