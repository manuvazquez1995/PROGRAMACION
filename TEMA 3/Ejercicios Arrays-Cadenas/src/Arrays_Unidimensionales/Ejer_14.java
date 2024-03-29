package Arrays_Unidimensionales;

public class Ejer_14 {

    /* 16. Crea un programa que cree un array de enteros e introduzca la siguiente secuencia
    de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces,
    y luego la muestre por pantalla. */
    public static void main(String[] args) {

        // Variables.
        int[] vector = new int[55];
        int posicionActual = 0; //Esta variable se usa para recorrer el vector.

        // Para "i" desde 1 hasta 10.
        for(int i = 1; i <= 10; i++){
            //Insertamos i veces el valor "i".
            for(int j = 1; j <= i; j++){
                vector[posicionActual] = i;
                posicionActual++;
            }
        }

        // Mostramos el contenido del array.
        opArray.mostrarArrayInt(vector);

    }


}