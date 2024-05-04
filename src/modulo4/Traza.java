package modulo4;

import java.util.Scanner;

public class Traza {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int numero = lector.nextInt();
        int resultado = 1;

        //
        for(int i = 1; i <= numero; i++){

            //
            resultado = resultado * i;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
