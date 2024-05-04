package modulo4;

import java.util.Scanner;

public class DoWhile_ej1 {

    public static void main(String[] args) {

        //
        Scanner sc = new Scanner(System.in);

        //
        int numero;

        //
        do{
            //
            System.out.print("Ingrese un número: ");
            numero = sc.nextInt();

            //
            System.out.println("El cuadrado del número es: " + (numero*numero));
        }while(numero <= 10);
    }
}
