package modulo7.busqueda;

public class BusquedaBinariaRecursiva {

    public static int buscarR(int[] vector, int e, int inicio, int fin) {
        if (fin >= inicio) {
            int medio = inicio + (fin - inicio) / 2;

            if (vector[medio] == e)
                return medio;

            if (vector[medio] > e)
                return buscarR(vector, e, inicio, medio - 1);

            return buscarR(vector, e, medio + 1, fin);
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] vector = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };

        int elemento = 23;

        int posicion = buscarR(vector, elemento, 0, vector.length - 1);

        if (posicion == -1)
            System.out.println("El elemento no está presente en el vector");
        else
            System.out.println("El elemento está presente en la posición " + posicion);
    }
}
