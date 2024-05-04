package modulo10.interfaz;

public class Programa {

    //
    public static void main(String[] args) {

        //
        FiguraGeometrica cuadrado = new Cuadrado(5);

        //
        FiguraGeometrica circulo = new Circulo(2.5);

        //
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
}
