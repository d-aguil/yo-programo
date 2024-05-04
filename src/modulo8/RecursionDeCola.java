package modulo8;

/*
En la recursión de cola, no hay cálculos adicionales después de la llamada recursiva, lo que significa que
no hay necesidad de mantener un registro de las llamadas recursivas pendientes. Esto tiene la ventaja de que
puede ser más eficiente en términos de uso de la pila de llamadas, lo que puede ser importante en lenguajes de
programación que no optimizan las llamadas recursivas a través de la eliminación de cola (tail call optimization).
 */

public class RecursionDeCola {

    public static int factorial(int n) {
        return factorialAux(n, 1);
    }

    private static int factorialAux(int n, int acumulado) {
        if (n == 0) {
            return acumulado;
        } else {
            return factorialAux(n - 1, n * acumulado);
        }
    }

    public static void main(String[] args) {
        int resultado = factorial(5);
        System.out.println("El factorial de 5 es: " + resultado);
    }
}
