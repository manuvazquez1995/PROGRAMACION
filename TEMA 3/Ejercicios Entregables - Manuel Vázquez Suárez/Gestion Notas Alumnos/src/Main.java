import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        // Array de objetos donde guardamos los alumnos con sus notas.
        ArrayList<alumno> listaAlumnos = new ArrayList<>();

        // Menu.
        methods.menu();
        int op = bufferedReader.leerInt();

        while(op!=6){
            switch (op){

                case 1 -> {
                    // Opción que muestra las notas de los alumnos.
                    methods.verNotas(listaAlumnos);
                    methods.menu();
                    op = bufferedReader.leerInt();
                }

                case 2 -> {
                    // Opción que añade los alumnos con sus respectivas notas.
                    methods.crearAlumno(listaAlumnos);
                    methods.menu();
                    op = bufferedReader.leerInt();
                }
                case 3 -> {
                    // Opción que sirve para borrar un alumno con su nota asociada.
                    methods.borrarAlumno(listaAlumnos);
                    methods.menu();
                    op = bufferedReader.leerInt();
                }
                case 4 -> {
                    // Muestra las estadísticas de los alumnos.
                    methods.verEstadisticas(listaAlumnos);
                    methods.menu();
                    op = bufferedReader.leerInt();
                }
                case 5 -> {
                    // Muestra una lista de alumnos suspensos.
                    methods.verSuspensos(listaAlumnos);
                    methods.menu();
                    op = bufferedReader.leerInt();
                }
                default -> {
                    System.err.println("Opción no válida, introduce una correcta: ");
                    methods.menu();
                    op = bufferedReader.leerInt();
                }
            }
        }
        System.out.println("FIN DEL PROGRAMA, ADIÓS");
    }

}