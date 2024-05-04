package modulo9;

public class Estatico {

    private static int instancias = 0;

    public Estatico(){

        //
        instancias++;
    }

    public static int getInstancias(){
        return instancias;
    }

    public static void main(String[] args) {

        Estatico objeto1 = new Estatico();
        Estatico objeto2 = new Estatico();
        Estatico objeto3 = new Estatico();

        System.out.println(Estatico.getInstancias());
    }
}
