package modulo8;

public class SumaArregloIterativo {

    public static int sumaArreglo(int[] arreglo) {
        //
        int suma=0;
        //
        for(int indice=0; indice<arreglo.length; indice++) {
            suma= suma + arreglo[indice];
        }

        return suma;
    }

    public static void main(String[] args) {
        //
        int[] arreglo = {1, 2, 3, 4, 5};
        //
        int suma = sumaArreglo(arreglo);
        //
        System.out.println("La suma del arreglo es: " + suma);
    }
}

