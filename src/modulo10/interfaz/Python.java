package modulo10.interfaz;

// Implementación de la interfaz Lenguaje para el lenguaje Python
public class Python implements Lenguaje {
    @Override
    public boolean verificar(String codigo) {
        // Verificar si el código
        return codigo.trim().startsWith("prin");
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando código Python...");
    }
}