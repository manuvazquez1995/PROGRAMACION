package Arrays_Bidimensionales;

public class Ejer_1 {

     /*1. Define un array de números enteros de 3 filas por 6 columnas con
          nombre "num" y asigna los valores según la siguiente tabla:
            *    num:
            *           Columna 0   Columna 1   Columna 2   Columna 3   Columna 4   Columna 5
            *    Fila 0     0          30           2                                   5
            *    Fila 1    75                                               0
            *    Fila 2                            -2           9                      11
            *
            *    Muestra el contenido de todos los elementos del array dispuestos en
                 forma de tabla como se muestra en la figura. */

    public static void main(String[] args) {

        // Creamos la matriz.
        int[][] matriz = new int[3][6];

        // Asignamos los valores en las posiciones indicadas.
        matriz[0][0] = 0;
        matriz[0][1] = 30;
        matriz[0][2] = 2;
        matriz[0][5] = 5;

        matriz[1][0] = 75;
        matriz[1][4] = 0;

        matriz[2][2] = -2;
        matriz[2][3] = 9;
        matriz[2][5] = 11;


        // Mostramos el contenido del array en forma de tabla.
            System.out.print("           Columna 0    Columna 1    Columna 2    Columna 3    Columna 4    Columna 5");
            System.out.println();
        for(int i=0; i<matriz.length; i++){
            System.out.print("Fila "+i+"          "+matriz[i][0]+"         "+matriz[i][1]+"           "+matriz[i][2]+"            "+matriz[i][3]+"           "+matriz[i][4]+"            "+matriz[i][5]);
            System.out.println();
        }



    }


}
