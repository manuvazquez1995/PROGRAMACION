package Arrays_Unidimensionales;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_15 {

    /* 15. Crea un programa que pida al usuario dos valores N y M y luego cree un array de tamaño N
    que contenga M en todas sus posiciones. Luego muestra el array por pantalla. */
    public static void main(String[] args) throws IOException {

        // Creamos un array que donde ya se pida su tamaño (Valor N).
        int[] vector = new int[opArray.array_length()];

        // Rellenamos el array con un método donde se utilizará un método con usando array.fill. (Valor M)
        System.out.println("- Introduce M: ");
        int m = bufferReader.leerInt();
        opArray.rellenarArrayFill(vector, m);

        //Mostramos el contenido del array.
        opArray.mostrarArrayInt(vector);

    }

}