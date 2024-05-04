package modulo4;

import java.util.Scanner;

/**
 * Escribir un programa en que dado un número del 1 al 7 escriba el correspondiente nombre del día de la semana.
 */
public class Ejercicio_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el nro de la semana: ");
        int dia = sc.nextInt();

        if ( dia == 1){
            System.out.println(" el dia es Lunes");
        } else if (dia == 2) {
            System.out.println("el dia es martes");
        } else if (dia == 3) {
            System.out.println("el dia es miercoles ");
        } else if (dia == 4) {
            System.out.println("el dia es jueves");
        }else if (dia == 5) {
            System.out.println( "el dia es viernes");
        } else if (dia == 6) {
            System.out.println(" el dia es sabado");
        } else if (dia == 7) {
            System.out.println("el dia es domingo");
        } else {
            System.out.println("el día ingresado no es válido");
        }
    }
}
