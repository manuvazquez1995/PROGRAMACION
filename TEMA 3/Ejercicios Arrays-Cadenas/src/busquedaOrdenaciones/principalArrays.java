package busquedaOrdenaciones;

import java.util.Arrays;
import java.util.List;

public class principalArrays {
    public static void main(String[] args) {
        BusquedaSimple bs = new BusquedaSimple();

        BusquedaBinaria bb = new BusquedaBinaria();

        int vector[] =  {1,2,35,100,45};

        List< Integer > sortedList = Arrays.asList(1,2,35,100,45);

        int pos=bs.busquedaSimple(vector,5,100);

        System.out.println("Está en la posición: "+pos);

        int key = 100;
        int low = 1;
        int high = vector.length - 1;

        int result = bb.runBinarySearchIteratively(vector, key, low, high);
        System.out.println("runBinarySearchIteratively result -> " + result);

        result = bb.runBinarySearchRecursively(vector, key, low, high);
        System.out.println("runBinarySearchRecursively result -> " + result);

        result = bb.runBinarySearchUsingJavaArrays(vector, key);
        System.out.println("runBinarySearchUsingJavaArrays result -> " + result);

        result = bb.runBinarySearchUsingJavaCollections(sortedList, key);
        System.out.println("runBinarySearchUsingJavaCollections result -> " + result);
    }
}
