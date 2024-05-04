package modulo10.herencia_persona;

public class Estudiante extends Persona{
    private String curso;

    public Estudiante(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Curso: " + curso);
    }
}
