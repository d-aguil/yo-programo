package modulo10.herencia_persona;

public class Profesor extends Persona{
    private String materia;

    public Profesor(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Materia: " + materia);
    }
}
