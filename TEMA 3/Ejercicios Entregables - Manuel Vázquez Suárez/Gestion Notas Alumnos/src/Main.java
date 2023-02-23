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
                    // TODO: FUNCIONA.
                    methods.verNotas(listaAlumnos);
                    methods.menu();
                    op = bufferedReader.leerInt();
                }

                case 2 -> {
                    // TODO: FUNCIONA.
                    methods.crearAlumno(listaAlumnos);
                    methods.menu();
                    op = bufferedReader.leerInt();
                }
                case 3 -> {
                    // TODO: FUNCIONA.
                    methods.borrarAlumno(listaAlumnos);
                    methods.menu();
                    op = bufferedReader.leerInt();
                }
                case 4 -> {
                    // TODO: FUNCIONA.
                    methods.verEstadisticas(listaAlumnos);
                    methods.menu();
                    op = bufferedReader.leerInt();
                }
                case 5 -> {
                    // TODO: FUNCIONA.
                    methods.verSuspensos(listaAlumnos);
                    methods.menu();
                    op = bufferedReader.leerInt();
                }
            }
        }
        System.out.println("FIN DEL PROGRAMA, ADIÓS");
    }

}