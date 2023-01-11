package Arrays_Unidimensionales;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_6 {

    /* 6. Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N,
    escriba M en todas sus posiciones y lo muestre por pantalla. */
    public static void main(String[] args) throws IOException {

        //Creamos el array a la vez que pedimos N para configurarlo.
        int[] array = new int[pedirN()];

        //Utilizamos el método que asigna M a cada posición del array (pedimos M en el proceso).
        asignarM(array);

        //Utilizamos un método que muestra los resultados.
        mostrarArray(array);

    }


    //Métodos que nos pide los valores y los devuelve.
    public static int pedirN() throws IOException {
        System.out.println("- Introduce N (tamaño array): ");
        return bufferReader.leerInt();
    }
    public static int pedirM() throws IOException{
        System.out.println("- Introduce M (nº a asignar): ");
        return bufferReader.leerInt();
    }

    //Método que asigna M a cada posición del array.
    public static void asignarM(int[] array) throws IOException {
        int m = pedirM();
        for(int i=0; i<array.length; i++){
            array[i] = m;
        }
    }

    //Método que muestra el contenido del array.
    public static void mostrarArray(int[] array){
        for(int x : array){
            System.out.print(" | "+x);
        }
        System.out.print(" | ");
    }


}