package modulo7.busqueda;

public class BusquedaBinariaTiempos {

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
        //
        int[] vector = new int[1000000];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = i;
        }

        // Medir el tiempo inicial
        long tiempoInicial = System.nanoTime();

        //
        buscar(vector, -1);

        // Medir el tiempo final
        long tiempoFinal = System.nanoTime();

        // Calcular el tiempo de recorrido
        long tiempoRecorrido = tiempoFinal - tiempoInicial;

        // Mostrar el tiempo de recorrido
        System.out.println("Tiempo de recorrido: " + tiempoRecorrido + " nanosegundos");
        System.out.println("Tiempo de recorrido: " + tiempoRecorrido / (double)1000000 + " milisegundos");
        System.out.println("Tiempo de recorrido: " + tiempoRecorrido / (double)1000000000 + " segundos");
    }
}
