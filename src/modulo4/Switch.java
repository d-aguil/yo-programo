package modulo4;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el día de la semana: ");
        int dia = scanner.nextInt();

        //
        switch (dia){
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            //...
            default:
                System.out.println("fin de semana");
        }
    }

    public static void main2(String[] args) {

        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el día de la semana: ");
        int dia = scanner.nextInt();

        //
        switch (dia) {
            case 1 -> System.out.println("lunes");
            case 2 -> System.out.println("martes");

            //...
            default -> System.out.println("fin de semana");
        }
    }

}
