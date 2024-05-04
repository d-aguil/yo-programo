package modulo4;

import java.util.Scanner;

/**
 * Escribir un programa en que dado un número del 1 al 7 escriba el correspondiente nombre del día de la semana.
 */
public class Ejercicio_1_bis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el nro de la semana: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1 -> System.out.println(" el dia es Lunes");
            case 2 -> System.out.println("el dia es martes");
            case 3 -> System.out.println("el dia es miercoles ");
            case 4 -> System.out.println("el dia es jueves");
            case 5 -> System.out.println("el dia es viernes");
            case 6 -> System.out.println(" el dia es sabado");
            case 7 -> System.out.println("el dia es domingo");
            default -> System.out.println("el día ingresado no es válido");
        }
    }

    public static void main2(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el nro de la semana: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println(" el dia es Lunes");
                break;
            case 2:
                System.out.println("el dia es martes");
                break;
            case 3:
                System.out.println("el dia es miercoles ");
                break;
            case 4:
                System.out.println("el dia es jueves");
                break;
            case 5:
                System.out.println("el dia es viernes");
                break;
            case 6:
                System.out.println(" el dia es sabado");
                break;
            case 7:
                System.out.println("el dia es domingo");
                break;
            default:
                System.out.println("el día ingresado no es válido");
                break;
        }
    }
}
