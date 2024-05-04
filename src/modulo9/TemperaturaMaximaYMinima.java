package modulo9;

import java.util.Random;

public class TemperaturaMaximaYMinima {

    public static void main(String[] args) {

        //Iniciamos los 7 días
        Temperatura[] registro = new Temperatura[7];

        for (int i = 0; i < 7; i++) {
            int minima = (new Random()).nextInt(-10,5);
            int maxima = (new Random()).nextInt(minima,minima + 15);
            registro[i] = new Temperatura(minima, maxima);
        }

        //
        int maxima = -100;
        int minima =  100;

        //
        for (int i = 0; i < registro.length; i++) {
            if (registro[i].getMinima() < minima){
                maxima = registro[i].getMinima();
            }
        }

        //
        for (Temperatura dia: registro){
            if (dia.getMaxima() > maxima){
                maxima = dia.getMaxima();
            }
        }
    }
}
