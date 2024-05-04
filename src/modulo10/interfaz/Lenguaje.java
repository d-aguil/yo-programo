package modulo10.interfaz;

// Interfaz que define el comportamiento básico de un lenguaje de programación
public interface Lenguaje {

    // verificar si el código proporcionado es válido
    boolean verificar(String codigo);

    // ejecutar el código
    void ejecutar();
}
