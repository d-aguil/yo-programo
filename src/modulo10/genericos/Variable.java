package modulo10.genericos;

public class Variable<T> {
    private T valor;

    public Variable(T inicial) {

        this.valor = inicial;
    }

    public T getValor() {

        return valor;
    }

    public void setValor(T valor) {

        this.valor = valor;
    }
}