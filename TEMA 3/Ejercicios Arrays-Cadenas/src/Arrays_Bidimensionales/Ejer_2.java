package Arrays_Bidimensionales;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_2 {

   /* 2. Escribe un programa que pida 20 números enteros.
            *    Estos números se deben introducir en un array de 4 filas por 5 columnas.
            *    El programa mostrará las sumas parciales de filas y columnas igual que
            *    si de una hoja de cálculo se tratara.
            *    La suma total debe aparecer en la esquina inferior derecha. */
    public static void main(String[] args) throws IOException {

        // Creamos el array.
        int[][] matriz = new int[4][5];
        // Para guardar la suma de cada fila.
        int[] sumasFilas = new int[4];
        //Para guardar la suma de cada columna.
        int[] sumasCol = new int[5];

        // Pedimos los números y los vamos metiendo en la matriz.
        for(int i=0; i<matriz.length; i++){  //Para recorrer las filas.
            for(int j=0; j<matriz[i].length; j++){       // Para recorrer las columnas.
                System.out.println("- Introducir número: ");
                int num = bufferReader.leerInt();
                matriz[i][j] = num;
                sumasFilas[i] = sumasFilas[i] + num; // Suma los valores de una columna.
            }
        }

        // Mostramos el contenido del array en forma de tabla.
        System.out.println();
        for(int i=0; i<matriz.length; i++){
            System.out.print("Fila "+i+"||\t");
            for(int j=0; j<matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t   ");

            }
            System.out.print("||Suma Fila: "+sumasFilas[i]);
            System.out.println();
        }


    }


}