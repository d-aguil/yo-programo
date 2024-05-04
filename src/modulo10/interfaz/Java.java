package modulo10.interfaz;

// Implementación de la interfaz Lenguaje para el lenguaje Java
public class Java implements Lenguaje {

    @Override
    public boolean verificar(String codigo) {
        // Verificar si el código ...
        return codigo.trim().startsWith("public class");
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando código Java...");
    }
}
