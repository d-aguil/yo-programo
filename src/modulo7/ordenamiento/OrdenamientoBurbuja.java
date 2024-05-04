package modulo7.ordenamiento;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class OrdenamientoBurbuja {

    //Método de ordenamiento x burbuja
    public static void ordenar(int[] vector) {

       //
        for (int i = 1; i < vector.length ; i++) {
            //
            for (int j = 0; j < vector.length - i ; j++) {
                System.out.printf("comparo V[%s], con V[%s]\n",j,j+1);
                //
                if (vector[j] < vector[j + 1]) {
                    //
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
    }

    /**
     *
     * @param vector
     */
    public static void mostrar(int[] vector) {

        for(int i=0; i< vector.length; i++){
            System.out.println(vector[i]);
        }
    }

    //
    public static void main(String[] args) {
        //
        int[] vector = { 12, -5, -8, 2, 1, 7, 0 };

        //
        ordenar(vector);

        mostrar(vector);

    }



}
