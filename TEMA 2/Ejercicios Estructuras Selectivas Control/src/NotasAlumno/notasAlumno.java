package NotasAlumno;
import lectorDatos.reader;

//Programa que, con 6 notas escribe la cantidad de alumnos aprobados, condicionados =4 y suspensos.
public class notasAlumno {

    public static void main(String[] args) {

    double nota;
    int aprobados = 0;
    int suspensos = 0;
    int condicionados = 0;

    /*Dentro del bucle pedimos las notas y comprobamos que es entre 1 y 10,
      a medida que recorremos el bucle este aumenta los contadores dependiendo
      de la nota.*/
    for(int i=0; i<=5; i++){
        System.out.println("Introduce una nota: ");
        nota = reader.leerDouble();
        if(nota>10 | nota<0){
            System.out.println("La nota debe ser entre 0 y 10, vuelva a introducirla: ");
            nota = reader.leerDouble();
        }

        if(nota<4){
            suspensos++;
        } else if (nota==4) {
            condicionados++;
        }else {
            aprobados++;
        }
    }

    //Mostramos los resultados.
    System.out.println("*********** RESULTADOS ***********\n" +
            "- APROBADOS: "+aprobados+"\n" +
            "- CONDICIONADOS: "+condicionados+"\n" +
            "- SUSPENSOS: "+suspensos);


    reader.close();
    }


}
