package modulo6;

public class Funcion_promedio {

    //
    public static float promedio(int[] vector, int cantidad){

        //
        float suma = 0;

        //
        for (int i=0; i< cantidad ; i++){ // cantidad = vector.length
            suma = suma + vector[i];
        }

        //
        return  suma / cantidad;
    }


    public static void main(String[] args) {

        //
        int[] elementos = {2,5,3,7,8};

        //
        float prom = promedio(elementos, 5);

        //
        System.out.println("El promedio de los valores es: "+ prom);
    }
}
