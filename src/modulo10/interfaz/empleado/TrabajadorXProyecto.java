package modulo10.interfaz.empleado;

public class TrabajadorXProyecto extends Empleado implements Trabajador {

    private static final int VALOR_PROYECTO = 1000;
    private int cantProyectos;

    public TrabajadorXProyecto(String nombre, long dni, String domicilio, String celular, int cantProyectos) {
        super(nombre, dni, domicilio, celular);
        this.cantProyectos = cantProyectos;
    }

    @Override
    public double calcularSueldo() {
        // Implementar la lógica para calcular el sueldo del TrabajadorXProyecto
        return cantProyectos * VALOR_PROYECTO;
    }

    public int getCantProyectos() {
        return cantProyectos;
    }

    public void setCantProyectos(int cantProyectos) {
        this.cantProyectos = cantProyectos;
    }

    @Override
    public String mostrarDatosAdicionales() {
        return "cantProyectos=" + cantProyectos+
               ", valorXProyecto=" + VALOR_PROYECTO;
    }
}