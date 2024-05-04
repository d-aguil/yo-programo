package modulo4;

import java.util.Scanner;

public class If_ej1 {

    public static void main(String[] args) {


        //
        System.out.print("Ingrese la hora: ");

        //
        Scanner lector = new Scanner(System.in);

        //
        int hora = lector.nextInt();

        //
        if (hora >= 6 && hora <= 12 ) {
            System.out.println("buenos días");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("buenas tardes");
        } else {
            System.out.println("buenas noches");
        }

    }

}
