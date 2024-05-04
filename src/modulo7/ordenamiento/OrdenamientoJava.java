package modulo7.ordenamiento;

import java.util.Arrays;

public class OrdenamientoJava {

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
        Arrays.sort(vector);

        //
        mostrar(vector);

    }



}
