package Arrays_Unidimensionales;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_7 {

    /* 7. Crea un programa que pida dos valores enteros P y Q,
    luego cree un array que contenga todos los valores desde P hasta Q,
    y lo muestre por pantalla. */
    public static void main(String[] args) throws IOException{

        //Creamos variables p y q y les asignamos valores.
        int p = pedirP();
        int q = pedirQ(p);

        //Creamos array, llamamos al método que cuenta los valores existentes entre p y q y se lo asigna.
        int[] listaNums = new int[cantidadNums(p,q)];

        //Asigna valores al array con el siguiente método.
        asignarValores(listaNums, p, q);

        //Mostramos los valores del array con el siguiente método.
        mostrarValores(listaNums);

    }


    //Métodos que nos pide los valores y los devuelve.
    public static int pedirP() throws IOException {
        System.out.println("- Introduce P: ");
        return bufferReader.leerInt();
    }

    //El método pedirQ pide el valor Q y comprueba que sea mayor que P.
    public static int pedirQ(int p) throws IOException{
        System.out.println("- Introduce Q: ");
        int q = bufferReader.leerInt();
        while(q < p){
            System.out.println("Valor Q no puede ser menor que P.\n" +
                    "Introduzca un otro valor: ");
            q = bufferReader.leerInt();
        }
        return q;
    }

    //Método que comprueba la cantidad de números que hay entre P y Q.
    public static int cantidadNums(int p, int q){
        int c = 0;
        for(int i = p; i <= q; i++){ //Cuenta los números que hay entre los 2 valores.
            c++;
        }
        return c;
    }

    //Método que asigna los valores en el array.
    public static void asignarValores(int[] listaNums, int p, int q) {
        int y = 0; //El valor que se guarda aquí es la posición del array al que tenemos que acceder, se autoincrementa.
        for(int i = p; i <= q; i++){
            listaNums[y] = i;
            y++;
        }
    }

    //Método que muestra los valores del array.
    public static void mostrarValores(int[] listaNums){
        System.out.println("- Valores entre P y Q: ");
        for(int n : listaNums){
            System.out.print("|"+n+"|");
        }
    }


}