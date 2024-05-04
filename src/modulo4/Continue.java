package modulo4;

public class Continue {

    public static void main(String[] args) {

        //
        for (int num = 1; num <= 10; num++) {

            //
            if (num % 2 == 0) {
                continue;
            }

            //
            System.out.println(num);
        }
    }

}
