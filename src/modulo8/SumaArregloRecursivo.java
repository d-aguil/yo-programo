package modulo8;

public class SumaArregloRecursivo {

    public static int sumaArreglo(int[] arreglo, int indice) {
        //
        if (indice == 0) {
            return arreglo[0];
        } else {
            return arreglo[indice] + sumaArreglo(arreglo, indice - 1);
        }
    }

    public static void main(String[] args) {
        //
        int[] arreglo = {1, 2, 3, 4, 5};
        //
        int suma = sumaArreglo(arreglo, arreglo.length - 1);
        //
        System.out.println("La suma del arreglo es: " + suma);
    }
}

