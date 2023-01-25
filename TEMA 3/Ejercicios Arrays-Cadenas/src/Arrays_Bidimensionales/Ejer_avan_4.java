package Arrays_Bidimensionales;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_avan_4 {

    /* 4. Necesitamos crear un programa para almacenar las notas de 4 alumnos
    (llamados “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas
    por teclado y luego el programa mostrará la nota mínima, máxima y media de cada alumno. */
    public static void main(String[] args) throws IOException {

        // Declaramos la matriz y otros arrays.
        int[][] alumnos = new int[4][5];
        double[] notaMin = new double[alumnos.length];
        double[] notaMax = new double[alumnos.length];
        double[] sumaNotas = new double[alumnos.length];
        double[] media = new double[alumnos.length];

        // Pedimos las notas de los alumnos.
        for(int i=0; i<alumnos.length; i++){
            System.out.println("Introduce las notas del "+(i+1)+"º alumno: ");
            for(int j = 0; j<alumnos[i].length; j++){
                int num;
                switch (j) {
                    case 0 -> {
                        System.out.println("- Matemáticas: ");
                        num = bufferReader.leerInt();
                        alumnos[i][j] = num;
                        sumaNotas[i] = sumaNotas[i] + num;
                    }
                    case 1 -> {
                        System.out.println("- Ingles: ");
                        num = bufferReader.leerInt();
                        alumnos[i][j] = num;
                        sumaNotas[i] = sumaNotas[i] + num;
                    }
                    case 2 -> {
                        System.out.println("- Música: ");
                        num = bufferReader.leerInt();
                        alumnos[i][j] = num;
                        sumaNotas[i] = sumaNotas[i] + num;
                    }
                    case 3 -> {
                        System.out.println("- Lengua castellana: ");
                        num = bufferReader.leerInt();
                        alumnos[i][j] = num;
                        sumaNotas[i] = sumaNotas[i] + num;
                    }
                    case 4 -> {
                        System.out.println("- Informática: ");
                        num = bufferReader.leerInt();
                        alumnos[i][j] = num;
                        sumaNotas[i] = sumaNotas[i] + num;
                    }
                }
            }
        }

        // Calculamos la nota media, mínima y máxima de cada alumno.
        for(int i = 0; i<sumaNotas.length; i++){
            media[i] = sumaNotas[i] / 5; //Para calcular la media.
            notaMin[i] = alumnos[i][0];   // Guardamos el primer valor de la fila para calcular el mínimo.
            notaMax[i] = alumnos[i][0];   // Guardamos el primer valor de la fila para calcular el máximo.
            for(int j = 0; j<alumnos[i].length; j++){
                if(alumnos[i][j]<notaMin[i]){  // Con el if comprobamos si en la misma fila hay valores menores y los guardamos.
                    notaMin[i] = alumnos[i][j];
                }
                if(alumnos[i][j]>notaMax[i]){  // Con el if comprobamos si en la misma fila hay valores mayores y los guardamos.
                    notaMax[i] = alumnos[i][j];
                }
            }
        }

        //Mostramos las notas de todos los alumnos.
        //TODO: lo comentado no funciona, REVISARLO.
        System.out.println();
        /* for(int i=0; i<alumnos[i].length; i++){
            switch (i) {
                case 0 -> {
                    System.out.print(" Mat \t");
                }
                case 1 -> {
                    System.out.print(" Ing \t");
                }
                case 2 -> {
                    System.out.print(" Mús \t");
                }
                case 3 -> {
                    System.out.print(" Len \t");
                }
                case 4 -> {
                    System.out.println(" Inf \t");
                }
            }
        }*/
        for(int i=0; i<alumnos.length; i++){   // Printeamos las filas.
            System.out.print("Alumno "+(i+1)+"||\t");
            for(int j=0; j<alumnos[i].length; j++) {
                System.out.print(alumnos[i][j]+"\t   ");

            }
            System.out.print("* Media: "+media[i]+" \t");
            System.out.print("* Mínima: "+notaMin[i]+" \t");
            System.out.print("* Máxima: "+notaMax[i]+" \t");
            System.out.println();
        }


    }

}