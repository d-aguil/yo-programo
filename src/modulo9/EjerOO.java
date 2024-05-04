package modulo9;

public class EjerOO {

    public static void main(String[] args) {

        //
        Vehiculo auto1 = new Vehiculo("AB-024-ZZ");
        auto1.setMarca("Renault");
        auto1.setColor("rojo");

        Vehiculo auto2 = new Vehiculo("BC-127-YY");
        auto2.setColor("blanco");
        auto2.setMarca("Fiat");

        System.out.println(auto1.getPatente());
        System.out.println(auto1.getMarca());
        System.out.println("---------------------");
        System.out.println(auto2.getPatente());
        System.out.println(auto2.getMarca());
    }
}
