package modulo9;

public class Libro {

    private String titulo;
    private String autor;
    private int año;
    private String isbn;

    //Constructor privado.
    private Libro(){
        this.titulo = "no-establecido";
    }

    public Libro(String titulo, String autor, int año, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAño() {
        return año;
    }

    public String getIsbn() {
        return isbn;
    }
}
