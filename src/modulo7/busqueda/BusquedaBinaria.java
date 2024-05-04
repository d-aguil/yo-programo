package modulo7.busqueda;

public class BusquedaBinaria {

    //
    public static int buscar(int[] vector, int e) {
        int inicio = 0;
        int fin = vector.length - 1;

        //
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (vector[medio] == e)
                return medio;

            if (vector[medio] < e)
                inicio = medio + 1;
            else
                fin = medio - 1;
        }

        //
        return -1;
    }

    public static void main(String[] args) {
        int[] vector = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };

        int elemento = 23;

        int posicion = buscar(vector, elemento);

        if (posicion == -1)
            System.out.println("El elemento no está presente en el vector");
        else
            System.out.println("El elemento está presente en la posición " + posicion);
    }
}
