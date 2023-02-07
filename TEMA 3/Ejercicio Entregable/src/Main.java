import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // Array de objetos donde guardamos los alumnos con sus notas.
        alumno[] listaAlumnos = new alumno[5];

        // Menu.
        methods.menu();
        int op = bufferedReader.leerInt();

        while(op!=6){
            switch (op){
                //TODO: FUNCIONA
                case 1 -> {
                    methods.verNotas(listaAlumnos);
                    methods.menu();
                    op = bufferedReader.leerInt();
                }
                //TODO: FUNCIONA
                case 2 -> {
                    methods.crearAlumno(listaAlumnos);
                    methods.menu();
                    op = bufferedReader.leerInt();
                }
                case 3 -> {}
                case 4 -> {}
                case 5 -> {}
            }


        }




    }






}