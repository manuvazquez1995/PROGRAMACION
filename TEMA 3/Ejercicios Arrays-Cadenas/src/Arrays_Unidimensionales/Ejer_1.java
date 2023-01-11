package Arrays_Unidimensionales;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_1 {

    /* 1. Crea un programa que pida diez números reales por teclado, los almacene en un array,
    y luego muestre todos sus valores. */
    public static void main(String[] args) throws IOException {

        //Declaramos un array y lo inicializamos.
        int[] listaNums = new int[10];

        //Pedimos los números y los vamos guardando en el array uno a uno.
        System.out.println("****** GUARDAR Nºs EN LISTA ******");
        for(int i=0; i<listaNums.length; i++){
            System.out.println("Introduzca el "+(i+1)+"º número: ");
            int num = bufferReader.leerInt();
            listaNums[i] = num;
        }

        //Mostramos cada número del array con el bucle for mejorado.
        System.out.println("- Números del array: ");
        for (int listaNum : listaNums) {
            System.out.print(" - " + listaNum);
        }

    }

}