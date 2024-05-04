package modulo6;

public class Alcance {

    final static int CONSTANTE = 10;
    //
    public static void alcance(){

        //
        int cantidad = 5;

        //
        for (int i=0; i< cantidad; i++){
            int parcial = i*2;
            System.out.println(parcial * CONSTANTE);
        }
    }

    public static void main(String[] args) {

        //
        alcance();
    }
}
