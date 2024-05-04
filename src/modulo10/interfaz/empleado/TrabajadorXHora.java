package modulo10.interfaz.empleado;

public class TrabajadorXHora extends Empleado implements Trabajador {

    private double valorHora;
    private int cantHoras;

    public TrabajadorXHora(String nombre, long dni, String domicilio, String celular, double valorHora, int cantHoras) {
        super(nombre, dni, domicilio, celular);
        this.valorHora = valorHora;
        this.cantHoras = cantHoras;
    }

    @Override
    public double calcularSueldo() {
        // Implementar la lógica para calcular el sueldo del TrabajadorXHora
        return valorHora * cantHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    @Override
    public String mostrarDatosAdicionales() {
        return "valorHora=" + valorHora +
               ", cantHoras=" + cantHoras;
    }
}