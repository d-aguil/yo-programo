package modulo6;

public class Funcion_variables {

    private static float media(int a, int b) {

        float promedio = (a + b) / 2;

        return promedio;
    }

    public static void main(String[] args) {

        //
        int num1 = 10;
        int num2 = 20;

        //
        float resultado = media(num1, num2);

        //
        System.out.println("La media aritmética es: "+ resultado);
    }

}
