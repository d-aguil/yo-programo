package modulo6;

public class SinLibreria {

    //
    public static void main(String[] args) {

        java.util.Scanner lector = new java.util.Scanner(System.in);
        java.util.Random aleatorio = new java.util.Random();

        int num1 = lector.nextInt();
        int num2 = aleatorio.nextInt(10);

        System.out.println("Los valores son iguales: " + (num1 == num2));
    }
}
