package Arrays_Unidimensionales;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_3 {

    /* 3. Crea un programa que pida diez números reales por teclado, los almacene en un array,
    y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla. */ //TODO: con métodos.
    public static void main(String[] args) throws IOException{

        //Declaramos un array y lo inicializamos.
        int[] listaNums = new int[10];

        //Pedimos por teclado con un método los números.
        rellenarArray(listaNums);

        //Mostramos los números con un método.
        mostrarArray(listaNums);

        //Mostramos el valor máximo que existe en el array con un método.
        System.out.println();
        System.out.println("- Número máximo: "+mostrarMaxArray(listaNums));

        //Mostramos el valor mínimo que existe en el array con un método.
        System.out.println("- Número mínimo: "+mostrarMinArray(listaNums));

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

    //Método que muestra el valor máximo en el array.
    public static int mostrarMaxArray(int[] listaNums){
        int max = listaNums[0];
        for(int n : listaNums){
            if(n > max){
                max = n;
            }
        }
        return max;
    }

    //Método que muestra el valor mínimo en el array.
    public static int mostrarMinArray(int[] listaNums){
        int min = listaNums[0];
        for(int n : listaNums){
            if(n < min){
                min = n;
            }
        }
        return min;
    }


}