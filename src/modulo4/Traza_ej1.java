package modulo4;

/**
 * qué hace el algoritmo? Realizar traza. Digitos...
 */

import java.util.Scanner;

public class Traza_ej1 {

    public static void main(String[] args) {

        int n = (new Scanner(System.in)).nextInt();
        while (n != 0) {
            int d = n % 10;
            System.out.println(d);
            n /= 10;
        }
    }
}
