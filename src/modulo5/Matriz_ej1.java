package modulo5;


import java.util.Scanner;

public class Matriz_ej1 {

    public static void main(String[] args) {

        //final int MAX_FIL = 3;
        final int MAX_COL = 4;

        //int[][] numeros = new int[MAX_FIL][MAX_COL];
        int[][] numeros = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        System.out.println("Ingresar el número de fila: ");
        int fila = (new Scanner(System.in)).nextInt();

        System.out.println("Los elementos de la fila son -> ");
        //
        for (int columna = 0; columna < MAX_COL; columna++) {
            //
            System.out.print(numeros[fila][columna]+" ");
        }

    }

}
