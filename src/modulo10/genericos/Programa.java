package modulo10.genericos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programa {

    public static void main(String[] args) {
        //
        Variable<Integer> variable = new Variable(10);
        System.out.println("El valor es: " + variable.getValor());

        //
        variable.setValor(20);
        System.out.println("El nuevo valor es: " + variable.getValor());

        //
        Variable<String> otra = new Variable("Hola");
        System.out.println("El valor es: " + otra.getValor());

        //
        otra.setValor("Hola Mundo, yo programo!");
        System.out.println("El nuevo valor es: " + otra.getValor());
    }
}
