package modulo10.abstracta;

public abstract class Animal {

    //
    private String nombre;


    //
    private int edad;

    //
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //
    public int getEdad() {
        return edad;
    }

    //
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //
    public String getNombre() {
        return nombre;
    }

    //
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //
    public void comer(){
        System.out.println("comiendo...");
    }

    //
    public abstract void dormir();
}
