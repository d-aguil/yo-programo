package modulo4;

/**
 * qué hace el algoritmo? Realizar traza. Primo?
 */

import java.util.Scanner;

public class Traza_ej2 {

    public static void main(String[] args) {

        int n = (new Scanner(System.in)).nextInt();
        boolean resultado = true;

        if (n <= 1) {
            resultado = false;
        }else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    resultado = false;
                }
            }
        }

        System.out.println(resultado);
    }
}
