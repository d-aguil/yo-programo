package modulo7.busqueda;

public class BusquedaLinealTiempos {

    //
    public static int buscar(int[] vector, int e) {

        //
        for (int i=0; i < vector.length; i++){
            if(vector[i] == e){
                return i;
            }
        }

        //
        return -1;
    }

    //
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
