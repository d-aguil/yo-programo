package modulo7.busqueda;

public class BusquedaLinealOrdenada {

    //
    public static int buscar(int[] vector, int e) {

        //
        for (int i=0; i < vector.length; i++){
            if(vector[i] == e){
                return i;
            } else if (vector[i] > e) {
                return -1;
            }
        }

        //
        return -1;
    }

    //
    public static void main(String[] args) {
        //
        int[] vector = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };

        //
        int elemento = 10;

        //
        int posicion = buscar(vector, elemento);

        //
        if (posicion == -1)
            System.out.println("El elemento no está presente en el vector");
        else
            System.out.println("El elemento está presente en la posición " + posicion);
    }
}
