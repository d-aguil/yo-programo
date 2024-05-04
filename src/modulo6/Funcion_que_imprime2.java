package modulo6;

public class Funcion_que_imprime2 {

    private static void cargar(int[] elementos) {
        elementos[0] = 10;
        elementos[1] = 20;
        elementos[2] = 30;
    }
    public static void main(String[] args) {

        int[] elementos = new int[3];
        //
        cargar(elementos);
        //
        System.out.println(elementos[0]+" "+elementos[1]+" "+elementos[2]);
    }



}
