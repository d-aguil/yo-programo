package modulo6;

import java.util.Random;
import java.util.Scanner;

//o podemos utilizar import java.util.*;
public class ConLibreria {

    //
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        Random aleatorio = new Random();

        int num1 = lector.nextInt();
        int num2 = aleatorio.nextInt(10);

        System.out.println("Los valores son iguales: " + (num1 == num2));
    }
}
