package modulo4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {

    public static void main(String[] args) {

        //
        Scanner scanner = new Scanner(System.in);

        //
        System.out.print("Ingrese un número: ");

        try {
            //
            int dia = scanner.nextInt();

            //
            System.out.println("El número ingresado es: "+dia);

        }catch(Exception ex) {

            //
            System.out.println("no se ingresó un número");
        }

        System.out.println("Termine,....");
    }

}
