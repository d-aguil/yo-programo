package modulo8;

public class factorial {

    //
    public static int factorialR(int n) {

        //
        if ((n == 0) || (n==1)) {
            //
            return 1;

        } else {

            //
            return n * factorialR(n-1);
        }
    }

    //
    public static int factorial(int n) {
        //
        int resultado = 1;

        //
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        //
        return resultado;
    }

    public static void main(String[] args) {

        int a = factorial(4);

        int b = factorialR(4);

        System.out.printf("El resultado del factorial de 4 es: [a=%s] - [b=%s]",a,b);

    }
}
