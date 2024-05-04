package modulo7.ordenamiento;

public class Programa {


    public static void main(String[] args) {
        //
        int[] vector = {12, -5, -8, 2, 1, 7, 0};

        //
        OrdenamientoSeleccion.ordenar(vector);

        //
        //OrdenamientoBurbuja.ordenar(vector);

        //
        //OrdenamientoInsercion.ordenar(vector);

        //
        imprimir(vector);


    }

    //
    private static void imprimir(int[] vector) {
        //
        for (int i:vector) {

            //
            System.out.println(i);
        }
    }
}
