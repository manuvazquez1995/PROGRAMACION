package Arrays_Unidimensionales;
import java.io.IOException;

public class Ejer_11 {

    /* 11. Crea un programa que cree dos arrays de enteros de tamaño 10. Luego introducirá en el primer array
    todos los valores del 1 al 10. Por último, deberá copiar todos los valores del primer array al segundo
    array en orden inverso, y mostrar ambos por pantalla. */
    public static void main(String[] args) throws IOException {

        //Creamos los arrays.
        int[] vector = new int[10];
        int[] vectorInv = new int[10];

        //Rellenamos el vector (el primero).
        opArray.rellenarArrayInt(vector);

        //Guardamos los valores del vector al vectorInv con un método (opArray)
        opArray.guardarInvArray(vector, vectorInv);

        //Mostramos los dos arrays.
        opArray.mostrarArrayInt(vector);
        opArray.mostrarArrayInt(vectorInv);

    }

}