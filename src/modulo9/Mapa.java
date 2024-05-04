package modulo9;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        HashMap<String, Integer> diccionario = new HashMap();

        //Veremos algunas particularidades del uso de diccionario mediante fragmentos de código

        //Agregamos pares clave-valor
        diccionario.put("primero", 1230);
        diccionario.put("segundo", 340);
        diccionario.put("tercero", 10);
        diccionario.put("cuarto", 0);

        //obtenemos el segundo elemento
        Integer puntaje = diccionario.get("primero");

        //obtenemos y removemos una relación
        Integer valor = diccionario.remove("cuarto");

        //obtenemos la cantidad de relaciones
        int tamaño = diccionario.size();

        //verificamos si exite la clave "quinto"
        boolean existe = diccionario.containsKey("quinto");

        //limpiamos el diccionario
        diccionario.clear();

        //averiguamos si el diccionario está vacia
        boolean vacia = diccionario.isEmpty();

    }

    public static void ejemploEdades(String[] args) {

        // Inicializa un HashMap con claves de tipo String y valores de tipo Integer
        HashMap<String, Integer> diccionario = new HashMap<>();

        // Agrega elementos al HashMap
        diccionario.put("Juan", 25);
        diccionario.put("María", 30);
        diccionario.put("Carlos", 28);

        // Recupera el valor asociado a una clave
        int edadMaria = diccionario.get("María");
        System.out.println("La edad de María es: " + edadMaria);

        // Comprueba si una clave está presente en el HashMap
        boolean contieneJuan = diccionario.containsKey("Juan");
        System.out.println("¿El HashMap contiene a Juan? " + contieneJuan);

        // Elimina un elemento del HashMap
        diccionario.remove("Carlos");

        // Itera sobre las claves y valores del HashMap
        for (String nombre : diccionario.keySet()) {
            int edad = diccionario.get(nombre);
            System.out.println(nombre + " tiene " + edad + " años.");
        }

        // Obtiene el número total de elementos en el HashMap
        int tamano = diccionario.size();
        System.out.println("El tamaño del HashMap es: " + tamano);

        //
        Map<String, Integer> empleados = new HashMap();

        //
        empleados.put("Ana", 35);
        empleados.put("Carlos", 30);
        empleados.put("Jose", 21);

        //
        if( empleados.containsKey("Carlos")) {
            //
            Integer edad = empleados.get("Carlos");
            //
            System.out.println("Edad de carlos: "+edad);
        }

        //obtenemos y removemos
        Integer edadJose = empleados.remove("Jose");

        //limpiamos el mapa
        empleados.clear();

        //averiguamos si el mapa esta vacío
        boolean vacio = empleados.isEmpty();

        //
        for (String nombre: empleados.keySet()) {
            Integer edad = empleados.get(nombre);
            System.out.printf("La edad de %s es de %s",
                    nombre,edad);
        }

        //
        Integer suma = 0;

        //
        for (Integer edad: empleados.values()) {
            suma = suma + edad;
        }

        //
        System.out.printf("El promedio de edades es %s",
                suma / empleados.size());

    }
}
