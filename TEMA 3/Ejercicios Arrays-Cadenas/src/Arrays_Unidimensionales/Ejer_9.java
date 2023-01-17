package Arrays_Unidimensionales;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_9 {

    /* 9. Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros aleatorios
    entre 1 y 10. Luego pedirá un valor N y mostrará en qué posiciones del array aparece N. */
    public static void main(String[] args) throws IOException {

        //Creamos el array.
        int[] listaNums = new int[100];

        //Rellenamos el array con un método.
        rellenarArray(listaNums);

        //Mostramos el array con un método.
        mostrarValores(listaNums);

        //Mostramos en que posiciones del array está un número pedido por teclado.
        buscarNumero(listaNums);

    }

    //Método que rellena el array con números aleatorios.
    public static void rellenarArray(int[] listaNums){
        for(int i=0; i<listaNums.length; i++){
            listaNums[i] = (int) (Math.random()*11);
        }
    }

    //Método que muestra los valores del array.
    public static void mostrarValores(int[] listaNums){
        for(int i=0; i<listaNums.length; i++){
            //Para que lo muestre en 2 filas y no en 1 porque es incómodo verlo.
            if (i == 49) {
                System.out.println();
            } else {
                System.out.print("|" + listaNums[i]);
            }
        }
        System.out.println();
        System.out.println("================================================================");
    }

    //Método que busca en qué posiciones del array está un número pedido por teclado (N).
    public static void buscarNumero(int[] listaNums) throws IOException {
        System.out.println("- Introduce un número a buscar: ");
        int n = bufferReader.leerInt();
        System.out.println("El número "+n+" está en las siguientes posiciones: ");
        for(int i = 0; i<listaNums.length; i++){
            if(n == listaNums[i]){
                System.out.print("|"+i);
            }
        }
    }


}