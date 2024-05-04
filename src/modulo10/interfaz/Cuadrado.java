package modulo10.interfaz;

public class Cuadrado implements FiguraGeometrica{

    //
    private final double lado;

    //
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    //
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
