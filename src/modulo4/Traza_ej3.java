package modulo4;

/**
 * qué hace el algoritmo? Realizar traza. MaxComDiv
 */

import java.util.Scanner;

public class Traza_ej3 {

    public static void main(String[] args) {

        int numero1 = (new Scanner(System.in)).nextInt();;
        int numero2 = (new Scanner(System.in)).nextInt();

        while (numero2 != 0) {
            int temp = numero2;
            numero2 = numero1 % numero2;
            numero1 = temp;
        }
        System.out.println(numero1);
    }
}
