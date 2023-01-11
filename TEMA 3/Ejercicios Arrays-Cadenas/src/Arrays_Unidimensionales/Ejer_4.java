package Arrays_Unidimensionales;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_4 {

    /* 4. Crea un programa que pida veinte números enteros por teclado, los almacene en un array
    y luego muestre por separado la suma de todos los valores positivos y negativos. */
    public static void main(String[] args) throws IOException {

        // Declaramos e inicializamos el array.
        int[] listaNums = new int[20];

        // Pedimos por teclado con un método los números.
        rellenarArray(listaNums);

        //Mostramos los números con un método.
        mostrarArray(listaNums);

        //Mostramos la suma de los números negativos y positivos.
        mostrarSumaPosNeg(listaNums);

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

    //Método que suma todos los valores positivos y negativos y muestra el resultado.
    public static void mostrarSumaPosNeg(int[] listaNums){
        int sumaN = 0;
        int sumaP = 0;
        for(int n : listaNums){
            if(n >= 0){
                sumaP = sumaP + n;
            }else{
                sumaN = sumaN + n;
            }
        }
        System.out.println("- Suma de positivos: "+sumaP+"\n" +
                "- Suma de negativos: "+sumaN);
    }


}