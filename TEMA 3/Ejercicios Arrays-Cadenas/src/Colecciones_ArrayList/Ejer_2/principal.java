package Colecciones_ArrayList.Ejer_2;
import metodosReutilizables.*;
import java.io.IOException;
import java.util.ArrayList;

class principal {

    /*
    Realizar un programa que cree una colección dinámica de tipo ArrayList,
    de objetos de Alumnos y realice los métodos:

                        MENÚ
        1_Añadir objetos a la colección usando un bucle adecuado.
        2_Listar los alumnos almacenados.
        3_Ordenar los alumnos.
        4_Búsqueda dicotómica de un alumno.
        5_Calcular Media por asignatura.
        6_Salir.
     */
    public static void main(String[] args) throws IOException {

        // Declaramos el array_list.
        ArrayList<alumno> alumnos = new ArrayList<>();

        // Menú principal.
        methods.menu();
        int op = bufferReader.leerInt();

        while(op!=6){
            switch (op){
                case 1 -> {
                    methods.crearAlumno(alumnos);
                    methods.menu();
                    op = bufferReader.leerInt();
                }
                case 2 -> {
                    methods.mostrarAlumnos(alumnos);
                    methods.menu();
                    op = bufferReader.leerInt();
                }
                case 3 -> {}
                case 4 -> {}
                case 5 -> {}
                default -> {
                    System.err.println("Opción no válida, introduzca una correcta.");
                    methods.menu();
                    op = bufferReader.leerInt();
                }
            }
        }


    }


}