package modulo9;

import java.util.Objects;

public class Vehiculo {

    //
    private String patente;

    //
    private String marca;

    //
    private String modelo;

    //
    private String color;

    //
    private static int pedidos = 0;

    // Constructor
    public Vehiculo() {
        this.patente = "";
        this.marca = "";
        this.modelo = "";
        this.color = "";
    }

    public Vehiculo(String unaPatente) {
        this.patente = unaPatente;
        this.marca = "";
        this.modelo = "";
        this.color = "";
    }

    public Vehiculo(String unaPatente, String unaMarca) {
        this.patente = unaPatente;
        this.marca = unaMarca;
        this.modelo = "";
        this.color = "";
    }

    // Constructor
    public Vehiculo(String patente, String marca, String modelo, String color) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    //
    public void setColor(String color) {
        //
        this.color = color;
    }

    //
    public String getColor() {

        incrementarContadorDePedidos();

        //
        return this.color;
    }

    /**
     * @return
     */
    public String getPatente() {

        incrementarContadorDePedidos();

        return patente;
    }

    private void incrementarContadorDePedidos() {
        pedidos = pedidos + 1;
    }

    /**
     * @param patente
     */
    public void setPatente(String patente) {

        this.patente = patente;
    }

    public String getMarca() {

        incrementarContadorDePedidos();

        return marca;
    }

    public String getModelo() {

        incrementarContadorDePedidos();

        return modelo;
    }

    //
    public void mostrarDatos(){

        incrementarContadorDePedidos();

        System.out.printf("Patente: %s - marca: %s - modelo: %s - color: %s \n", patente, marca, modelo, color);

    }

    public int getPedidos() {
        return pedidos;
    }

    /*public boolean equals(Vehiculo auto) {

        if ( this.getPatente()      == auto.getPatente()
                && this.getMarca()  == auto.getMarca()
                && this.getModelo() == auto.getModelo()
                && this.getColor()  == auto.getColor()  ){

            return true;

        } else {

            return false;
        }
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;

        //si quisiera que sean iguales solo por la patente
        //return Objects.equals(patente, vehiculo.patente);

        //quiero que sean igual si todos los atributos son iguales
        if ( this.getPatente()      == vehiculo.getPatente()
                && this.getMarca()  == vehiculo.getMarca()
                && this.getModelo() == vehiculo.getModelo()
                && this.getColor()  == vehiculo.getColor()  ){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(patente);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
