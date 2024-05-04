package modulo9;

public class Llamadas_Pila {

    public static void main(String[] args) {

        //
        PilaEstatica direcciones = new PilaEstatica();

        // Agregar las direcciones de memoria
        direcciones.push(100000);
        direcciones.push(105000);
        direcciones.push(200100);

        //
        while(!direcciones.isEmpty()){
            int direccion = direcciones.pop();
            System.out.println("Volvemos a: "+direccion);
        }
    }
}
