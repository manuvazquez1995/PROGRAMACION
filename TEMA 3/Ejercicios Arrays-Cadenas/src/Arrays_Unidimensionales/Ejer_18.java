package Arrays_Unidimensionales;

public class Ejer_18 {

    /* 18. Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios
    entre 0 y 9 (utiliza Math.random()*10)). Luego ordena los valores del array y los
    mostrará por pantalla. */
    public static void main(String[] args) {

        // Creamos un array de tamaño 30.
        int[] vector = new int[30];

        // Rellenamos el array con números aleatorios con un método estático.
        opArray.rellenarArrayAleatorios(vector);

        // Mostramos los valores del array.
        opArray.mostrarArrayInt(vector);

        // Ordenamos los valores del array de forma ascendente usando un método estático.
        opArray.ordenarArray(vector);

        // Mostramos los valores del array ordenado.
        opArray.mostrarArrayInt(vector);

    }


}