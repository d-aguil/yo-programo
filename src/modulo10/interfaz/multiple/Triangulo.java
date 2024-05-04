package modulo10.interfaz.multiple;


public class Triangulo implements Figura, Poligono {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base + 2 * Math.sqrt((base / 2) * (base / 2) + altura * altura);
    }

    @Override
    public int obtenerNumeroLados() {
        return 3;
    }
}
