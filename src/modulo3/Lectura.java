package modulo3;

import java.util.Scanner;

public class Lectura {

    public static void main(String[] args){

        //
        System.out.print("Ingrese su nombre: ");

        //
        Scanner scanner = new Scanner(System.in);

        //
        String nombre = scanner.nextLine();

        //
        System.out.println("Buenos días "+nombre);

    }

}
