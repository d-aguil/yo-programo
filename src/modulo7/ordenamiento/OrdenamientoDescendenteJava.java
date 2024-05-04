package modulo7.ordenamiento;

import java.util.Arrays;
import java.util.Collections;

public class OrdenamientoDescendenteJava {

    /**
     *
     * @param vector
     */
    public static void mostrar(Integer[] vector) {

        for(int i=0; i< vector.length; i++){
            System.out.println(vector[i]);
        }
    }

    //
    public static void main(String[] args) {
        //
        Integer[] vector = { 12, -5, -8, 2, 1, 7, 0 };

        //
        Arrays.sort(vector, Collections.reverseOrder());

        //
        mostrar(vector);

    }



}
