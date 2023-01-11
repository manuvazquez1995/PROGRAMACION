package Arrays_Unidimensionales;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_2 {

    /* 2. Crea un programa que pida diez números reales por teclado,
    los almacene en un array, y luego muestre la suma de todos los valores. */
    public static void main(String[] args) throws IOException {

        //Declaramos un array y lo inicializamos.
        int[] listaNums = new int[10];
        int suma = 0; //Guarda la suma de los valores.

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

        //Sumamos todos los valores del array y mostramos el resultado.
        System.out.println();
        System.out.println("- La suma de todos los números: ");
         for(int n : listaNums){
             suma = suma + n;
         }
         System.out.print(suma);

    }

}