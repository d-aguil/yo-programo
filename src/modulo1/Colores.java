package modulo1;

public class Colores {
    public static void main(String[] args) {

        System.out.println("\033[0mTexto \033[0m"); // Rojo
        System.out.println("\033[31mTexto en rojo\033[0m"); // Rojo
        System.out.println("\033[32mTexto en verde\033[0m"); // Verde
        System.out.println("\033[33mTexto en amarillo\033[0m"); // Amarillo
        System.out.println("\033[34mTexto en azul\033[0m"); // Azul
        System.out.println("\033[35mTexto en magenta\033[0m"); // Magenta
        System.out.println("\033[36mTexto en cian\033[0m"); // Cian
        System.out.println("\033[37mTexto en blanco\033[0m"); // Blanco

        System.out.println("\033[91mTexto en rojo brillante\033[0m"); // Rojo brillante
        System.out.println("\033[92mTexto en verde brillante\033[0m"); // Verde brillante
        System.out.println("\033[93mTexto en amarillo brillante\033[0m"); // Amarillo brillante
        System.out.println("\033[94mTexto en azul brillante\033[0m"); // Azul brillante
        System.out.printf("\033[95mTexto en magenta brillante"); // Magenta brillante
        System.out.printf("Texto en magenta brillante\033[0m"); // Magenta brillante
        System.out.println("\033[96mTexto en cian brillante\033[0m"); // Cian brillante
        System.out.println("\033[97mTexto en blanco brillante\033[0m"); // Blanco brillante

        System.out.println("\033[1mTexto en negrita\033[0m"); // Negrita
        System.out.println("\033[3mTexto en cursiva\033[0m"); // Cursiva
        System.out.println("\033[4mTexto subrayado\033[0m"); // Subrayado

        System.out.println("\033[31mTexto en rojo\033[0m");
        System.out.println("\033[42mTexto con fondo verde\033[0m");

        // Emoji
        System.out.println("\u266b");
        System.out.println("\u26F1");
        System.out.println("\u2601");
        System.out.println("\u2602");
        System.out.println("\uD83D\uDC4D Emoji pulgar arriba");
    }
}
