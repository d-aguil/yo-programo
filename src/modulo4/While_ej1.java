package modulo4;

import java.util.Scanner;

public class While_ej1 {

    public static void main(String[] args) {

        //
        System.out.print("Ingrese un número mayor a 10: ");

        //
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        //
        while(numero <= 10){
            System.out.println(" El número no es mayor a 10....");
            System.out.print("Ingrese otro: ");
            numero = sc.nextInt();
        }
    }

}
