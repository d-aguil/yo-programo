package modulo5;

/**
 * Declarar un vector de 1000 elementos de tipo entero.
 * Asignar a cada elemento del vector el valor relativo a su posición.
 */
public class Vector_ej2 {

    public static void main(String[] args) {

        //
        final int N = 1000;

        //
        int[] elementos = new int[N];

        //
        for( int pos=0; pos < N; pos++){
            elementos[pos] = pos;
        }
    }

}
