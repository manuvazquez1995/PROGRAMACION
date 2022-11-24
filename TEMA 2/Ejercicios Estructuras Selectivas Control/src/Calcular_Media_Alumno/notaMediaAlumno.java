package Calcular_Media_Alumno;
import lectorDatos.reader;

public class notaMediaAlumno {

    public static void main(String[] args) {

        double nota = 0;
        double sumaNota = 0;
        double media = 0;
        int contador = 0;

        System.out.println("Calcular nota media de un alumno");
        System.out.println("*********************************");
        System.out.println("Introduzca un valor a calcular: ");
        nota = reader.leerDouble();

        do{
            sumaNota = sumaNota + nota;
            contador = contador + 1;
            System.out.println("Introduzca un valor a calcular: ");
            nota = reader.leerDouble();

        }while (nota > 0);

        media = sumaNota / contador;

        System.out.println("*********************************");
        System.out.println("La media del alumno es: "+media);

        reader.close();
    }

}
