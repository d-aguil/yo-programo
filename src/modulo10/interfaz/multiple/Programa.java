package modulo10.interfaz.multiple;

import java.util.ArrayList;
import java.util.List;

public class Programa {

    //
    public static void main(String[] args) {

        //
        Cuadrado cuadrado = new Cuadrado(5);

        //
        Triangulo triangulo = new Triangulo(6,4);

        //
        List<Figura> figuras = new ArrayList();

        //
        figuras.add(cuadrado);
        figuras.add(triangulo);

        //
        for (Figura figura: figuras) {
            System.out.println("Perímetro: " + figura.calcularPerimetro());
        }

        //
        List<Poligono> poligonos = new ArrayList(figuras);

        //
        for (Poligono poligono: poligonos) {
            System.out.println("Lados: " + poligono.obtenerNumeroLados());
        }
    }
}
