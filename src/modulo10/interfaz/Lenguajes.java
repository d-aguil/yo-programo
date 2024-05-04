package modulo10.interfaz;

import java.util.ArrayList;
import java.util.Random;

public class Lenguajes {
    public static void main(String[] args) {
        // Lista de lenguajes de programación
        ArrayList<Lenguaje> lenguajes = new ArrayList<>();

        //
        lenguajes.add(new Java());
        lenguajes.add(new Python());
        lenguajes.add(new CSharp());

        // Códigos de ejemplo para cada lenguaje
        String codigo = "";

        switch ((new Random()).nextInt(1,4)) {
            case 1:{
                    codigo = "public class Main {...";
                    break;
                }
            case 2:{
                codigo = "print('Hola, Mundo!')...";
                break;
            }
            case 3:{
                codigo = "using System; class Program {...";
                break;
            }
        }

        //recorremos los lenguajes
        for (Lenguaje lenguaje : lenguajes) {
            if (lenguaje.verificar(codigo)) {
                lenguaje.ejecutar();
            }
        }
    }
}