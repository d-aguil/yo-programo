package modulo3;


import java.util.Scanner;

public class FuncionesTexto {

    public static void main(String[] args){

        //
        Scanner lector = new Scanner(System.in);

        //
        System.out.print("ingrese un valor x: ");

        int x = lector.nextInt();

        System.out.print("ingrese un valor y: ");
        int y = lector.nextInt();

        System.out.println(x+y);

        System.out.println("0123456789".substring(0,1));
        long varEntera = 10;
        float varDecimal = 10;
        String varTexto = "soy un texto";

        System.out.printf("mostrando un entero %d\n", varEntera);
        System.out.printf("mostrando un decimal %f\n", varDecimal);
        System.out.printf("mostrando un texto %s\n", varTexto);

        System.out.printf("Nombre: %20s, Edad: %3d\n", "Juan", 30);

    }

}
