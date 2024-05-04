package modulo10.interfaz.empleado;

public abstract class Empleado {

    private String nombre;
    private long dni;
    private String domicilio;
    private String celular;

    public Empleado(String nombre, long dni, String domicilio, String celular) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public abstract String mostrarDatosAdicionales();

    public String mostrarInformacion() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", domicilio='" + domicilio + '\'' +
                ", celular='" + celular + '\'' +
                "}, {"+ mostrarDatosAdicionales()+"}";
    }
}