package modulo5;

import java.util.Scanner;


public class Matriz_ej3 {

    public static void main(String[] args) {

        //
        final int N = 3;

        //
        int[][] numeros = new int[N][N];

        //
        Scanner scanner = new Scanner(System.in);

        //
        for (int fila = 0; fila < N; fila++) {
            for (int columna = 0; columna < N; columna++) {
                numeros[fila][columna] = scanner.nextInt();
            }
        }

        //
        for (int fila = 0; fila < N; fila++) {
            //
            for (int columna = 0; columna < N; columna++) {
                //
                if (numeros[fila][columna] % 2 == 0) {
                    //
                    System.out.println(
                            String.format("fila: %s - columna: %s - valor: %s",
                                    fila,
                                    columna,
                                    numeros[fila][columna])
                    );
                }
            }
        }
    }

}
