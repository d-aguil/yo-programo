package modulo10.interfaz.empleado;

public class TrabajadorDePlanta extends Empleado implements Trabajador {

    private int valorHora;
    private static final int HORA_MES = 140;
    private int antiguedad;

    public TrabajadorDePlanta(String nombre, long dni, String domicilio, String celular, int valorHora, int antiguedad) {
        super(nombre, dni, domicilio, celular);
        this.valorHora = valorHora;
        this.antiguedad = antiguedad;
    }

    @Override
    public double calcularSueldo() {
        // Implementar la lógica para calcular el sueldo del TrabajadorPlanta
        return (valorHora * HORA_MES)+((valorHora * HORA_MES)*antiguedad/100);
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    @Override
    public String mostrarDatosAdicionales() {
        return  "valorHora=" + valorHora +
                ", horasXMes=" + HORA_MES +
                ", antiguedad=" + antiguedad;
    }
}