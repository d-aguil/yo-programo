package modulo8;

/*
La memoización es una técnica de optimización que almacena los resultados de llamadas a funciones recurrentes
 para evitar recalcularlos repetidamente. Esto permite mejorar el rendimiento de la recursión y
 reducir el tiempo de ejecución.
 */
import java.util.HashMap;
import java.util.Map;

public class RecursionMemoizacion {
    private static Map<Integer, Integer> memo = new HashMap();

    public static int fibonacciMemo(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
            int resultado = fibonacciMemo(n - 1) + fibonacciMemo(n - 2);
            memo.put(n, resultado);
            return resultado;
        }
    }

    public static void main(String[] args) {
        int resultado = fibonacciMemo(10);
        System.out.println("Fibonacci de 10: " + resultado);
    }
}
