package modulo9;

public class VehiculoEjercicio {

    public static void main(String[] args) {

        Vehiculo auto1 = new Vehiculo(
                "AA-123-XX","Renault","Sandero","Azul");

        Vehiculo auto2 = new Vehiculo(
                "BB-234-XX","Toyota","Etios","Blanco");

        System.out.printf("Auto 1 - %s - %s - %s - %s",
                auto1.getPatente(),
                auto1.getMarca(),
                auto1.getModelo(),
                auto1.getColor());

        System.out.printf("Auto 2 - %s - %s - %s - %s",
                auto2.getPatente(),
                auto2.getMarca(),
                auto2.getModelo(),
                auto2.getColor());
    }
}
