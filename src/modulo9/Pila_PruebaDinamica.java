package modulo9;

public class Pila_PruebaDinamica {

    public static void main(String[] args) {
        PilaDinamica pila = new PilaDinamica();

        // Agregar elementos a la pila
        pila.push(10);
        pila.push(20);
        pila.push(30);

        //
        pila.imprimir();

        // Eliminar elementos de la pila
        System.out.println("\nEliminando un elemento de la pila:");
        int elementoEliminado = pila.pop();
        System.out.println("Elemento eliminado: " + elementoEliminado);
        pila.imprimir();

        // Obtener el último elemento sin eliminarlo
        System.out.println("\nObteniendo el último elemento:");
        int ultimoElemento = pila.peek();
        System.out.println("Último elemento: " + ultimoElemento);
        pila.imprimir();

        // Verificar si la pila está vacía
        System.out.println("\n¿La pila está vacía?: " + pila.isEmpty());
    }

}
