package modulo9;

import java.util.Random;

public class Temperatura {

    //
    private int minima;

    //
    private int maxima;

    //
    public Temperatura(int minima, int maxima) {
        this.minima = minima;
        this.maxima = maxima;
    }

    public int getMinima() {
        return minima;
    }

    public int getMaxima() {
        return maxima;
    }

    public void setMinima(int minima) {
        this.minima = minima;
    }

    public void setMaxima(int maxima) {
        this.maxima = maxima;
    }
}
