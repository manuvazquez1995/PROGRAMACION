package Arrays_Unidimensionales;
import java.io.IOException;

public class Ejer_10 {

    /* 10. Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
    Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego mostrará
    la altura media, máxima y mínima así como cuántas personas miden por encima y por debajo de la media. */
    public static void main(String[] args) throws IOException {

        // Creamos el array pidiendo ya su tamaño con un método.
        double[] vector = new double[opArray.array_length()];
        int menoresMedia = 0;
        int mayoresMedia = 0;

        /* Utilizamos un método que está en la clase "operacionesArray" que rellena el array con valores
        pedidos por teclado. */
        opArray.rellenarArrayDouble(vector);

        // Mostramos los valores del array con un método de la clase "operacionesArray".
        opArray.mostrarArrayDouble(vector);

        // Mostramos la altura máxima de todas.
        System.out.println(" - La altura máxima es: "+opArray.mostrarMaxDouble(vector));

        // Mostramos la altura mínima de todas.
        System.out.println("- La altura mínima es: "+opArray.mostrarMinDouble(vector));

        // Mostramos la media de las alturas.
        System.out.println("- La altura media es: "+opArray.mostrarMediaDouble(vector));


        // Calculamos y mostramos la cantidad de personas que miden más que la media y las que menos.
        for(double n : vector) {
            if (n < opArray.mostrarMediaDouble(vector)) {
                menoresMedia++;
            } else if (n > opArray.mostrarMediaDouble(vector)) {
                mayoresMedia++;
            }
        }
        System.out.println("- Personas mas altas que la media: " + mayoresMedia);
        System.out.println("- Personas mas bajas que la media: " + menoresMedia);
    }


}
