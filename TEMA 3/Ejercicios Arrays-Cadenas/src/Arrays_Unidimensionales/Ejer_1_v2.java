package Arrays_Unidimensionales;
import metodosReutilizables.bufferReader;
import java.io.IOException;

public class Ejer_1_v2 {

    /* 1. Crea un programa que pida diez números reales por teclado, los almacene en un array,
    y luego muestre todos sus valores. */ //TODO: con métodos.
    public static void main(String[] args) throws IOException {

        //Declaramos un array y lo inicializamos.
        int[] listaNums = new int[10];

        //Pedimos los números y los vamos guardando en el array uno a uno con un método.
        System.out.println("****** GUARDAR Nºs EN LISTA ******");
        rellenarArray(listaNums);

        //Mostramos cada número del array llamando un método.
        System.out.println("- Números del array: ");
        mostrarArray(listaNums);

    }


    //Método que pide y guarda números en un array.
    public static void rellenarArray(int[] listaNums) throws IOException {
        for(int i=0; i<listaNums.length; i++){
            System.out.println("Introduzca el "+(i+1)+"º número: ");
            int num = bufferReader.leerInt();
            listaNums[i] = num;
        }
    }

    //Método que muestra cada uno de los valores del array con el bucle for mejorado.
    public static void mostrarArray(int[] listaNums){
        for (int listaNum : listaNums) {
            System.out.print(" - " + listaNum);
        }
    }



}