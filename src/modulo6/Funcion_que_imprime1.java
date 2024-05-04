package modulo6;

public class Funcion_que_imprime1 {

    private static int suma(int a, int b) {
        a = 2; b = 3;
        return a + b;
    }

    public static void main(String[] args) {

        //
        int num1 = 10;
        int num2 = 20;

        //
        int resultado = suma(num1, num2);

        //
        System.out.println(num1+" "+num2+" "+resultado);
    }

}
