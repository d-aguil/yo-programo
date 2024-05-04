package modulo10.interfaz.multiple;

import modulo10.interfaz.multiple.Figura;
import modulo10.interfaz.multiple.Poligono;

public class Cuadrado implements Figura,Poligono {

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

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public int obtenerNumeroLados() {
        return 4;
    }
}
