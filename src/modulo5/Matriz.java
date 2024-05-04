package modulo5;

import java.sql.SQLOutput;

public class Matriz {

    public static void main2(String[] args) {

        //
        int[][] matriz = new int[3][4];

        matriz[0][0] = 10;
        matriz[0][1] = 5;
        matriz[0][2] = 17;
        matriz[0][3] = 0;

        matriz[1][0] = 1;
        matriz[1][1] = 3;
        matriz[1][2] = 11;
        matriz[1][3] = 7;

        matriz[2][0] = -4;
        matriz[2][1] = 2;
        matriz[2][2] = 22;
        matriz[2][3] = -12;
    }

    public static void main(String[] args) {

        //
        int[][] matriz =
               {{1,2,3}, //1RA FILA CON 3 ELEMENTOS,
                {4,5,6},
                {7,8,9}};

        for( int[] fila: matriz){
            for( int elemento: fila){
                System.out.println(elemento);
            }
        }
    }
}
