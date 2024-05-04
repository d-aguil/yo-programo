package modulo9;

import java.util.ArrayList;
import java.util.List;

public class PilaDinamica {

    private List<Integer> elementos;

    public PilaDinamica() {
        elementos = new ArrayList<>();
    }

    //
    public void push(int elemento) {
        elementos.add(elemento);
    }

    //
    public int pop() {
        return elementos.remove(elementos.size() - 1);
    }

    //
    public int peek() {
        return elementos.get(elementos.size() - 1);
    }

    //
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    //
    public void imprimir() {

        System.out.print("Pila: [");
        for (int i = 0; i < elementos.size(); i++) {
            System.out.print(elementos.get(i));
            if (i < elementos.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
