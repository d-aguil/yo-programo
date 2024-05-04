package modulo9;

public class Pila_PruebaEstatica {

    public static void main(String[] args) {
        PilaEstatica pila = new PilaEstatica();

        // Agregar elementos a la pila
        pila.push(10);
        pila.push(20);
        pila.push(30);

        //
        pila.imprimir();

        //
        System.out.println("Eliminando un elemento de la pila:");
        int elemento = pila.pop();

        System.out.println("Elemento eliminado: " + elemento);
        pila.imprimir();

        //
        System.out.println("Obteniendo el último elemento:");
        int ultimo = pila.peek();

        System.out.println("Último elemento: " + ultimo);
        pila.imprimir();

        //
        System.out.println("¿La pila está vacía?: "
                + pila.isEmpty());
    }

}
