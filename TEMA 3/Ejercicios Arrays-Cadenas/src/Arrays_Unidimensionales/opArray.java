package Arrays_Unidimensionales;
import metodosReutilizables.bufferReader;
import java.io.IOException;
import java.util.Arrays;

public class opArray {

    //TODO: Método para asignar el tamaño a un array.
    static int array_length() throws IOException {
        System.out.println("- Introduce el tamaño del array: ");
        return bufferReader.leerInt();
    }


    //TODO: Métodos para mostrar arrays.
    public static void mostrarArrayDouble(double[] vector){
        System.out.println("- Valores del array: ");
        for(double n : vector){
            System.out.print("|"+n);
        }
        System.out.println();
    }
    public static void mostrarArrayInt(int[] vector){
        System.out.println("- Valores del array: ");
        for(int n : vector){
            System.out.print("|"+n);
        }
        System.out.println();
    }


    //TODO: Métodos para rellenar arrays.
    public static void rellenarArrayDouble(double[] listaNums) throws IOException {
        for(int i=0; i<listaNums.length; i++){
            System.out.println("Introduzca el "+(i+1)+"º número: ");
            double num = bufferReader.leerDouble();
            listaNums[i] = num;
        }
    }
    public static void rellenarArrayInt(int[] listaNums) throws IOException {
        for(int i=0; i<listaNums.length; i++){
            System.out.println("Introduzca el "+(i+1)+"º número: ");
            int num = bufferReader.leerInt();
            listaNums[i] = num;
        }
    }


    //TODO: método que rellena todo el array con un único valor usando el método fill de la clase array.
    //Solo para Ints.
    public static void rellenarArrayFill(int[] vector, int m){
        Arrays.fill(vector, m);
    }


    //TODO: método que rellena un array con números aleatorios.
    public static void rellenarArrayAleatorios(int[] vector){
        for(int i=0; i<vector.length; i++){
            vector[i] = (int) (Math.random()*10);
        }
    }


    //TODO: método que ordena lo valores de un array de ascendentemente.
    public static void ordenarArray(int[] vector){
        Arrays.sort(vector);
    }


    //TODO: Método para mostrar el valor mínimo.
    public static double mostrarMinDouble(double[] vector){
        double min = vector[0];
        for(double n : vector){
            if(n < min){
                min = n;
            }
        }
        return min;
    }


    //TODO: Método para mostrar el valor máximo.
    public static double mostrarMaxDouble(double[] vector){
        double max = vector[0];
        for(double n : vector){
            if(n > max){
                max = n;
            }
        }
        return max;
    }


    //TODO: Método que muestra la media de los valores.
    public static double mostrarMediaDouble(double[] vector){
        double media;
        double suma = 0;
        for(double n : vector){
            suma = suma + n;
        }
        media = suma / vector.length;
        media = Math.round(media*100.0)/100.0; //Para que solo tenga 2 decimales, ya que mostraba muchos.
        return media;
    }


    //TODO: Método que pasa los valores de un array a otro inversamente.
    public static int[] guardarInvArray(int[] vector, int[] vectorInv){
        for(int i=0; i<vector.length; i++){
            vectorInv[vectorInv.length-1-i]=vector[i];
        }
        return vectorInv;
    }


    //TODO: Método que indica si 2 arrays son iguales (solo para Ints).
    // Los 2 arrays tienen que ser del mismo tamaño, en caso de no ser así, fallará.
    public static boolean comprobarIgualesInt(int[] vector1, int[] vector2){
        return Arrays.equals(vector1, vector2); //Devuelve directamente verdadero si son iguales, si no devuelve falso.
    }


}