package modulo9;

public class Llamadas_Arreglo {

    public static void main(String[] args) {

        //
        int[] direcciones = new int[100];
        int pos = 0;

        // Agregar las direcciones de memoria
        direcciones[pos] = 100000;
        pos++;
        direcciones[pos] = 105000;
        pos++;
        direcciones[pos] = 200100;
        pos++;

        //
        while( pos > 0 ){
            int direccion = direcciones[pos -1];
            System.out.println("Volvemos a: "+direccion);
            pos--;
        }
    }
}
