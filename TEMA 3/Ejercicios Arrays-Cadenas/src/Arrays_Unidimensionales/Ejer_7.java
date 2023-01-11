package Arrays_Unidimensionales;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_7 {

    /* 7. Crea un programa que pida dos valores enteros P y Q,
    luego cree un array que contenga todos los valores desde P hasta Q,
    y lo muestre por pantalla. */
    public static void main(String[] args) throws IOException{








    }


    //Métodos que nos pide los valores y los devuelve.
    public static int pedirP() throws IOException {
        System.out.println("- Introduce P: ");
        return bufferReader.leerInt();
    }

    //El método pedirQ pide el valor Q y comprueba que sea mayor que P.
    public static int pedirQ(int p) throws IOException{
        System.out.println("- Introduce M (nº a asignar): ");
        int q = bufferReader.leerInt();
        while(q < p){
            System.out.println("Valor Q no puede ser menor que P.\n" +
                    "Introduzca un otro valor: ");
            q = bufferReader.leerInt();
        }
        return q;
    }



}