package modulo9;

public class PilaEstatica {

    private final int MAX=100;
    private int[] elementos;
    private int pos;

    public PilaEstatica() {
        elementos = new int[MAX];
        pos = 0;
    }

    //
    public void push(int elemento) {
        elementos[pos] = elemento;
        pos++;
    }

    //
    public int pop() {
        pos--;
        return elementos[pos];
    }

    //
    public int peek() {
        //
        return elementos[pos - 1];
    }

    //
    public boolean isEmpty() {
        return pos == 0;
    }

    //
    public void imprimir() {
        System.out.print("Pila: [");
        for (int i = 0; i < pos; i++) {
            System.out.print(elementos[i]);
            if (i < pos - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
