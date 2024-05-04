package modulo7.ordenamiento;

public class OrdenamientoSeleccion {

    //
    public static void ordenar1(int[] vector) {

        //
        final int N = vector.length;

        //
        for (int i = 0; i < N - 1; i++) {

            //
            int pos = i;

            //
            for (int j = i + 1; j < N; j++) {
                System.out.printf("comparo V[%s], con V[%s]\n",j,pos);
                if (vector[j] < vector[pos]) {
                    pos = j;
                }
            }

            //
            int menor = vector[pos];
            vector[pos] = vector[i];
            vector[i] = menor;
        }
    }

    public static void ordenar(int[] vector) {

        //
        for (int i = 0; i < vector.length - 1; i++) {
            //
            int posMenor = i;

            //
            for (int j = i + 1; j < vector.length; j++) {

                //
                if (vector[j] < vector[posMenor]) {
                    posMenor = j;
                }
            }

            //
            int menor = vector[posMenor];
            vector[posMenor] = vector[i];
            vector[i] = menor;
        }
    }

    //
    public static void main(String[] args) {
        //
        int[] vector = { 12, -5, -8, 2, 1, 7, 0 };

        //
        ordenar(vector);

        //
        for (int i:vector) {

            //
            System.out.println(i);
        }
    }
}
