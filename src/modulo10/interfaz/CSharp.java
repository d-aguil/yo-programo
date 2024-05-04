package modulo10.interfaz;

// Implementación de la interfaz Lenguaje para el lenguaje C#
public class CSharp implements Lenguaje {
    @Override
    public boolean verificar(String codigo) {
        // Verificar si el código ...
        return codigo.trim().startsWith("using ");
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando código C#...");
    }
}