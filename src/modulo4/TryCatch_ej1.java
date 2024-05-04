package modulo4;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Solicitar al usuario que ingrese un número "válido" y mayor a 10.
 * En caso de ingresar un valor igual o menor, se le pedirá al usuario que ingrese otro número.
 */
public class TryCatch_ej1 {

    public static void main(String[] args) {

        System.out.print("Ingrese un número mayor a 10: ");

        //
        Scanner sc = new Scanner(System.in);
        int numero =0;

        do{

            try {

                System.out.print("ingrese un número: ");
                numero = sc.nextInt();

            }catch(Exception e) {
                System.out.println("Eso no parece un número....");
                sc.nextLine(); // evitar la NO lectura del símbolo de RC
                /**
                 * scanner.nextInt() method only consumes the integer part and leaves the enter or newline character in the input buffer.
                 * https://www.freecodecamp.org/news/java-scanner-nextline-call-gets-skipped-solved/
                 */
            }

        }while(numero <= 10);

        System.out.println("termina...numero="+numero);
    }
}
