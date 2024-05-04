package modulo9;

public class Envoltorio {

    public static void main(String[] args) {

        //
        Integer numA = 123;

        //
        Integer numB = Integer.valueOf(123);
        //
        int primitivo = 123;

        //
        Integer numC = Integer.valueOf(primitivo);

        //
        Integer numD = Integer.parseInt("123");

        //
        System.out.println(numA == 123);
        System.out.println(numB == 123);
        System.out.println(numC == 123);
        System.out.println(numD == 123);
        System.out.println(primitivo == 123);

        //
        System.out.println(numA.equals(123));

        //
        System.out.println(numA == numB);
        System.out.println(numA == numC);
        System.out.println(numA == numD);
        System.out.println(numB == numC);
        System.out.println(numB == numD);
        System.out.println(numC == numD);

        //
        System.out.println(numA == primitivo);
    }
}
