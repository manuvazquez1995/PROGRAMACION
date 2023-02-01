package busquedaOrdenaciones;

import java.util.Arrays;

public class OrdenacionSortArray {
    public static void main(String[] args) {

        final int TAMANIO=10;
        int lista[]=new int [TAMANIO];
        rellenarArray(lista);

        String lista_String[]={"americano", "Zagal", "pedro", "Tocado", "coz"};

        System.out.println("Array de números sin ordenar:");
        imprimirArray(lista);

        //ordenamos el array
        Arrays.sort(lista);

        System.out.println("Array de números ordenado:");
        imprimirArray(lista);

        System.out.println("Array de String sin ordenar:");
        imprimirArray(lista_String);

        //ordenamos el array, ordenará primero las mayúsculas y luego las minúsculas
        Arrays.sort(lista_String);

        System.out.println("Array de String ordenado:");
        imprimirArray(lista_String);

        parallelSortTry();

        parallelSortTry2();

        parallelSortTry3();
    }

    public static void imprimirArray (int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }

    public static void imprimirArray (String lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }

    public static void rellenarArray (int lista[]){
        for(int i=0;i<lista.length;i++){
            lista[i]=numeroAleatorio();
        }
    }

    private static int numeroAleatorio (){
        return ((int)Math.floor(Math.random()*1000));
    }

    /*
    Ordenar los elementos de un array usando el método parallelSort() en Java
    Si trabajas con Java 8 o una versión superior, puedes usar el método parallelSort() de la clase Arrays.
    Este método es útil para ordenar en un entorno multihilo. Vea el ejemplo a continuación.

    * */

    public static void parallelSortTry(){
        int[] arr = new int[]{12,3,5,21,4,85,6,9,2,1};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        Arrays.parallelSort(arr);
        System.out.println("\nAfter Sorting...");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    /*
    Java proporciona un método sobrecargado de parallelSort() para ordenar los subconjuntos.
    Significa que podemos ordenar algunos elementos de un array de un índice específico a otro índice específico (índice final).
    Este método toma tres argumentos; uno es un array, el segundo y el tercero es el índice de inicio y final del array a ordenar.
    Véase el ejemplo que figura a continuación.
    * */

    public static void parallelSortTry2(){
        System.out.println("");
        System.out.println("parallelSort() con 3 argumentos");
        int[] arr = new int[]{12,3,5,21,4,85,6,9,2,1};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        Arrays.parallelSort(arr, 0, 5);
        System.out.println("\nAfter Sorting...");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    /*
    Si quieres usar la característica de flujo de Java,
    entonces usa el método sorted() que ordenará los elementos,
    y al usar toArray(), recogemos los elementos en un array.
     */

    public static void parallelSortTry3(){
        System.out.println("");
        System.out.println("parallelSort() con stream");
        int[] arr = new int[]{12,3,5,21,4,85,6,9,2,1};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        arr = Arrays.stream(arr).sorted().toArray();
        System.out.println("\nAfter Sorting...");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
