package modulo10.herencia_persona;

public class Programa {

    public static void main(String[] args) {

        Persona persona = new Persona("Juan", 30);
        Estudiante estudiante = new Estudiante("María", 20, "Matemáticas");
        Profesor profesor = new Profesor("Carlos", 45, "Física");

        System.out.println("Información de la Persona:");
        persona.mostrarInfo();

        System.out.println("\nInformación del Estudiante:");
        estudiante.mostrarInfo();

        System.out.println("\nInformación del Profesor:");
        profesor.mostrarInfo();
    }
}
