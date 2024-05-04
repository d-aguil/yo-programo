package modulo9;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo(){
        this.base = 0;
        this.altura = 0;
    }

    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public int getPerimetro(){
        return base*2 + altura*2;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getBase() {
        return base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }
}
