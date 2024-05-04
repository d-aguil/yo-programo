package modulo5;


public class Matriz_recorrido {

    public static void main(String[] args) {

        //
        final int MAX_FIL = 3;
        final int MAX_COL = 4;

        //
        int[][] numeros = new int[MAX_FIL][MAX_COL];

        //1er fila y las 4 columnas
        numeros[0][0] = 10;
        numeros[0][1] = 5;
        numeros[0][2] = 17;
        numeros[0][3] = 0;

        //2da fila y las 4 columnas
        numeros[1][0] = 1;
        numeros[1][1] = 3;
        numeros[1][2] = 11;
        numeros[1][3] = 7;

        //3er fila y las 4 columnas
        numeros[2][0] = -4;
        numeros[2][1] = 2;
        numeros[2][2] = 22;
        numeros[2][3] = -12;

        // va ir de 0 a 2 para FILA
        for (int fila = 0; fila < MAX_FIL; fila++) {
            // va ir de 0 a 3 para COLUMNA
            for (int columna = 0; columna < MAX_COL; columna++) {
                //
                System.out.print(numeros[fila][columna] + ", ");
            }
            System.out.println();
        }
    }

}
