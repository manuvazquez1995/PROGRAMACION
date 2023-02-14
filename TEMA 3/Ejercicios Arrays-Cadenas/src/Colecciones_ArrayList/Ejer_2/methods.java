package Colecciones_ArrayList.Ejer_2;
import metodosReutilizables.bufferReader;
import java.io.IOException;
import java.util.ArrayList;

class methods {

    //Método que muestra las opciones del menú.
    public static void menu(){
        System.out.println("""
                ******************** MENÚ ********************
                (1) Añadir alumnos.
                (2) Listar los alumnos almacenados.
                (3) Ordenar los alumnos.
                (4) Búsqueda dicotómica de un alumno.
                (5) Calcular media por asignatura.
                (6) Salir.
                - Escoja una opción:
                """);
    }


    // Método para crear un producto y guardarlo en un arrayList.
    public static void crearAlumno(ArrayList<alumno> alumnos) throws IOException {
        System.out.println("***** NUEVO ALUMNO *****");
        System.out.println("- Introduzca el nombre del alumno: ");
        String nombre = bufferReader.leerString();
        System.out.println("- Introduce su nota en matemáticas: ");
        float notaMat = bufferReader.leerFloat();
        while (esNeg(notaMat)) {
            System.err.println("La nota no puede ser negativa.");
            System.out.println("Introduzca una nota válida.");
            notaMat = bufferReader.leerFloat();
        }
        System.out.println("- Introduce su nota en informática: ");
        float notaInf = bufferReader.leerFloat();
        while (esNeg(notaInf)) {
            System.err.println("La nota no puede ser negativa.");
            System.out.println("Introduzca una nota válida.");
            notaInf = bufferReader.leerFloat();
        }

        alumnos.add(new alumno(nombre, notaMat, notaInf));

        System.out.println();
    }


    // Método que muestra una lista con todos los alumnos alumacenados.
    public static void mostrarAlumnos(ArrayList<alumno> alumnos){
        if(alumnos.isEmpty()){
            System.err.println("No hay ningún alumnos que mostrar.");
        }else{
            System.out.println("***** LISTA DE ALUMNOS *****");
            for(alumno a : alumnos){
                System.out.println("* Alumno: " + a.getNombre());
                System.out.println("* Notas: ");
                System.out.println("\t- "+a.getAsignatura1()+": " + a.getNota1());
                System.out.println("\t- "+a.getAsignatura2()+": " + a.getNota2());
                System.out.println();
            }
        }
        System.out.println();
    }


    //Método que comprueba si un número es negativo (para floats).
    public static boolean esNeg(float num){
        boolean esNeg = false;
        if(num<0){
            esNeg = true;
        }
        return esNeg;
    }


}