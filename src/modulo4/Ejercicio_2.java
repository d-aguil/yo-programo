package modulo4;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int horas = lector.nextInt();
        float precio = lector.nextFloat();
        float sueldo  = 0;

        if(horas>40){
            int extras = horas - 40;
            horas = 40;
            sueldo = extras * (precio * 2);
        }
        sueldo = sueldo + (horas * precio);
        System.out.println("El sueldo es: "+sueldo);

    }

}
