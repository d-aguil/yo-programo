package modulo9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        //
        List<String> lista = new ArrayList();

        //Agregamos objetos de tipo String
        lista.add("Hola");
        lista.add("Mundo");

        //recorremos los elementos
        for(int pos=0; pos < lista.size(); pos++){
            String elemento = lista.get(pos);
            System.out.println(elemento);
        }

        //recorremos los elementos
        for (String elemento: lista) {
            System.out.println(elemento);
        }

        //obtenemos el segundo elemento
        String texto = lista.get(1);

        //obtenemos y removemos el segundo elemento
        String elemento = lista.remove(1);

        //obtenemos la cantidad de elementos
        int tamaño = lista.size();

        //obtenemos la posición del elemento "Mundo"
        int posicion = lista.indexOf("Mundo");

        //limpiamos los elementos de la lista
        lista.clear();

        //averiguamos si la lista está vacía
        boolean vacia = lista.isEmpty();

        //averiguamos si la lista contiene el elemento "Mundo"
        boolean contiene = lista.contains("Mundo");

        //
        List<String> colores = new ArrayList<String>();

        //
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        colores.add("blanco");
        colores.add("amarillo");

        //
        System.out.println("Contenido de la lista: ");

        //
        for(String color: colores) {
            System.out.println(color);
        }

        //
        Iterator<String> iterador = colores.iterator();

        //
        while(iterador.hasNext()){
            String color = iterador.next();
            System.out.println(color);
        }

        //
        for(int i=0; i < colores.size(); i++){
            String color = colores.get(i);
            System.out.println(color);
        }
    }
}
