package Arrays_Unidimensionales;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_5 {

    /* 5. Crea un programa que pida veinte números reales por teclado,
    los almacene en un array y luego lo recorra para calcular y mostrar la media:
    (suma de valores) / nº de valores. */
    public static void main(String[] args) throws IOException{

        // Declaramos el array y lo inicializamos.
        int[] listaNums = new int[20];

        // Pedimos y guardamos los números en el array.
        rellenarArray(listaNums);

        // Mostramos los números del array.
        mostrarArray(listaNums);

        // Mostramos la media de todos los números.
        calcularMedia(listaNums);

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
        System.out.println();
    }

    //Método que calcula la media de todos los números del array.
    public static void calcularMedia(int[] listaNums){
        int media;
        int suma = 0;
        for(int n : listaNums){
            suma = suma + n;
        }
        media = suma / listaNums.length;
        System.out.println(" - Media: "+media);
    }


}