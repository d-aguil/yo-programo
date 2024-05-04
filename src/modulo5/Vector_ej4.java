package modulo5;

import java.util.Scanner;

/**
 * Declarar un vector de 1000 elementos de tipo entero.
 * Asignar a cada elemento del vector el valor relativo a su posición.
 */
public class Vector_ej4 {

    public static void main(String[] args) {

        //
        final int N = 20;

        //
        int[] elementos = new int[N];

        //
        Scanner scanner = new Scanner(System.in);

        //leemos 20 elementos
        for( int pos=0; pos < N; pos++){
            System.out.println("Ingrese el valor de la posiición " + (pos+1) );
            elementos[pos] = scanner.nextInt();
        }

        //mostramos pares
        for( int pos=0; pos < N; pos++){
            if (elementos[pos] % 2 == 0){
                System.out.println(elementos[pos]);
            }
        }
    }

}
