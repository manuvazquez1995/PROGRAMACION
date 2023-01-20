package Arrays_Unidimensionales;

import java.util.Arrays;

public class Ejer_16 {

    /* 16. Crea un programa que cree un array de enteros e introduzca la siguiente secuencia
    de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces,
    y luego la muestre por pantalla. En esta ocasión has de utilizar Arrays.fill(). */
    // TODO: REPASAR PARA ENTENDERLO BIEN.
    public static void main(String[] args) {

        // Variables.
        int[] vector = new int[55];
        int posicionActual = 0; //Esta variable se usa para recorrer el vector.

        // Para "i" desde 1 hasta 10.
        for(int i = 1; i <= 10; i++){
            Arrays.fill(vector, posicionActual, posicionActual+1, i);
            posicionActual++;

        }

        // Mostramos el contenido del array.
        opArray.mostrarArrayInt(vector);

    }

}