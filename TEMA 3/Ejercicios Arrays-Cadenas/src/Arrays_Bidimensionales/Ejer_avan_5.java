package Arrays_Bidimensionales;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_avan_5 {

    /* 5. Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una empresa
    y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la
    información de N personas distintas (valor también introducido por teclado). */
    public static void main(String[] args) throws IOException {

        // Creamos la matriz pidiendo ya la cantidad de personas que contendrá, esto será el tamaño de la matriz.
        int[][] trabajadores = new int[numTrabajadores()][2];

        // Pedimos los datos de cada uno de los/las trabajadores/as.
        for(int i=0; i<trabajadores.length; i++){
            System.out.println("- Trabajador Nº"+(i+1)+":");
            System.out.println("- Para asignar sexo: 0 = Hombre, 1 = mujer.");
            for(int j=0; j<trabajadores[i].length; j++){
                switch (j){
                    case 0 -> {
                        System.out.println("- Introduce su sexo: ");
                        int sexo = bufferReader.leerInt();
                        while(sexo<0 | sexo>1){
                            System.err.println("- Tiene que ser 0 o 1.");
                            System.out.println("Introduce un valor válido: ");
                            sexo = bufferReader.leerInt();
                        }
                        trabajadores[i][j] = sexo;
                    }
                    case 1 -> {
                        System.out.println("- Introduce el sueldo:");
                        int sueldo = bufferReader.leerInt();
                        while (sueldo<0){
                            System.err.println("- No puede tener sueldo negativo: ");
                            System.out.println("Introduce un sueldo válido: ");
                            sueldo = bufferReader.leerInt();
                        }
                        trabajadores[i][j] = sueldo;
                    }
                }
            }
        }

        // Mostramos los valores de la matriz.
        for(int i=0; i<trabajadores.length; i++){   // Printeamos las filas.
            System.out.print("Trabajador/a "+(i+1)+"||\t");
            for(int j=0; j<trabajadores[i].length; j++) {
                System.out.print(trabajadores[i][j]+"\t   ");

            }
            System.out.println();
        }

    }


    // Método que pide el tamaño de la matriz, que va siendo la cantidad de trabajadores.
    static int numTrabajadores() throws IOException {
        return bufferReader.leerInt();
    }


}