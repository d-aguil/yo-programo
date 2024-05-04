package modulo9;

public class Alumno {
    private String nombre;
    private int legajo;
    private double notaCursada;

    public Alumno(String nombre, int legajo, double notaCursada) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.notaCursada = notaCursada;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public double getNotaCursada() {
        return notaCursada;
    }
}
