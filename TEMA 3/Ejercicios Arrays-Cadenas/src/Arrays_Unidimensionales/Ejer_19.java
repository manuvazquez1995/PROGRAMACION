package Arrays_Unidimensionales;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_19 {

    /* 19. Necesitamos crear un programa para mostrar el rating de los 8 jugadores de un torneo de ajedrez.
    Primero se le pedirá al usuario que introduzca el rating de todos los jugadores (habitualmente valores
    entre 1000 y 2800, de tipo entero) y luego muestre el rating en orden descendente (de la más alta a la
    más baja). */
    public static void main(String[] args) throws IOException {

        // Creamos un array de tamaño 8.
        int[] vector = new int[8];

        // Rellenamos el array con números comprendidos entre 1000 y 2800 (no se hace con ningún método estático).
        for(int i=0; i<vector.length; i++){
            System.out.println("- Introduce un número: ");
            int num = bufferReader.leerInt();
            while(num<1000 | num>2800){
                System.err.println("- Tiene que ser entre 1000 y 2800");
                System.out.println("- Introduce un número válido: ");
                num = bufferReader.leerInt();
            }
            vector[i] = num;
        }

        // Mostramos los números del array.
        opArray.mostrarArrayInt(vector);

        // Ordenamos el array con un método.
        opArray.ordDescVector(vector);

        // Mostramos el array ordenado descendentemente.
        opArray.mostrarArrayInt(vector);

    }


}