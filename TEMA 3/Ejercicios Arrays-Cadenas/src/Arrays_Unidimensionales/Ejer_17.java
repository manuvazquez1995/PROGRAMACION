package Arrays_Unidimensionales;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_17 {

    /* 17. Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en
    un array y los 10 últimos en otro array. Por último, comparará ambos arrays y le dirá al
    usuario si son iguales o no. */
    public static void main(String[] args) throws IOException {

        // Creamos 2 arrays del mismo tamaño.
        int[] vector1 = new int[10];
        int[] vector2 = new int[10];

        //Rellenamos los 2 arrays, los 10 primeros en el primero, los 10 últimos al último array.
        System.out.println("- Introduce 20 números: ");
        for(int i=0; i<20; i++){
            System.out.println("- Introduce el "+(i+1)+"º número: ");
            if(i<10){
                vector1[i] = bufferReader.leerInt();
            }else{
                vector2[i-10] = bufferReader.leerInt();
            }
        }

        // Mostramos el contenido de los 2 vectores.
        opArray.mostrarArrayInt(vector1);
        opArray.mostrarArrayInt(vector2);

        // Indicamos si los 2 vectores son iguales con un método estático.
        if(opArray.comprobarIgualesInt(vector1,vector2)){
            System.out.println("- Los dos vectores SI son iguales. ");
        }else{
            System.out.println("- Los dos vectores NO son IGUALES. ");
        }

    }


}