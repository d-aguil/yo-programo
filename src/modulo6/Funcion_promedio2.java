package modulo6;

public class Funcion_promedio2 {

    //
    public static float promedio(int[] vector){

        //
        float suma = 0;
        int cantidad = vector.length;

        //
        for (int i=0; i< cantidad ; i++){
            suma = suma + vector[i];
        }

        //
        return  suma / cantidad;
    }


    public static void main(String[] args) {

        //
        int[] elementos = {1,2,3,4,5};

        //
        float prom = promedio(elementos);

        //
        System.out.println("El promedio de los valores es: "+ prom);
    }
}
