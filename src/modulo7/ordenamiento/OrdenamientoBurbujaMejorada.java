package modulo7.ordenamiento;

public class OrdenamientoBurbujaMejorada {

    //Método de ordenamiento x burbuja mejorado
    public static void ordenar(int[] vector) {

       //
        for (int i = 1; i < vector.length ; i++) {

            //
            boolean ordenado = true;

            //
            for (int j = 0; j < vector.length - i ; j++) {

                System.out.printf("comparo V[%s], con V[%s]\n",j,j+1);

                //
                if (vector[j] < vector[j + 1]) {

                    //
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;

                    //
                    ordenado = false;
                }
            }
            if(ordenado){
                break;
            }
        }
    }

    /**
     *
     * @param vector
     */
    public static void mostrar(int[] vector) {

        for(int i=0; i< vector.length; i++){
            System.out.println(vector[i]);
        }
    }

    //
    public static void main(String[] args) {
        //
        int[] vector = { 12, -5, -8, 2, 1, 7, 0 };

        //
        ordenar(vector);

        mostrar(vector);

    }



}
