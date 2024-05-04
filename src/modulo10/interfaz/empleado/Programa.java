package modulo10.interfaz.empleado;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        //
        List<Trabajador> empleados = new ArrayList<>();

        //
        empleados.add(new TrabajadorXProyecto("Juan Pérez",
                12345678,
                "Calle 123",
                "1234567890",
                5));
        empleados.add(new TrabajadorXHora("María González",
                87654321,
                "Calle 456",
                "9876543210",
                20.00,
                120));
        empleados.add(new TrabajadorDePlanta("Pedro López",
                78901234,
                "Calle 789",
                "0987654321",
                20,
                10));

        //
        for (Trabajador empleado : empleados) {
            System.out.printf("Empleado: %s\n", empleado.mostrarInformacion());
            System.out.printf("Sueldo: %f$ \n", empleado.calcularSueldo());
            System.out.println("-----------------------------------------");
        }
    }
}