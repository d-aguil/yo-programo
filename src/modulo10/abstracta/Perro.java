package modulo10.abstracta;

public class Perro extends Animal {

    //
    private String raza;

    //
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    //
    public String getRaza() {
        return raza;
    }

    //
    public void setRaza(String raza) {
        this.raza = raza;
    }

    //
    public void ladrar(){
        System.out.println("gua gau...");
    }

    //
    @Override
    public void dormir() {
        System.out.println("Durmiendo, pero en alerta..");
    }
}
