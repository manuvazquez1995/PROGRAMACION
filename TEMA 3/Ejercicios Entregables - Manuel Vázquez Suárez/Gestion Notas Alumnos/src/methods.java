import java.io.IOException;
import java.util.ArrayList;

public class methods {


    // Método que imprime las opciones del menú.
    public static void menu(){
        System.out.println("""
                *********** MENU ***********
                (1) Ver notas.
                (2) Añadir notas.
                (3) Borrar nota.
                (4) Estadísticas.
                (5) Ver suspendidos.
                (6) Salir
                """);
    }


    // Método que sirve para crear un alumno.
    public static void crearAlumno(ArrayList<alumno> listaAlumnos) throws IOException {
        if(arrayIsFull(listaAlumnos)){   //Con este método, se comprueba que si ya existen 100 alumnos. No se utiliza en ningún momento, pero el enunciado lo exige.
            System.err.println("ERROR: La lista de alumnos está completa.");
        }else{
                String nombre;
                int nota;

                //Alumno 1
                nombre = "Manuel";
                nota = 10;
                listaAlumnos.add(new alumno(nombre, nota));

                //Alumno 2
                nombre = "Diana";
                nota = 8;
                listaAlumnos.add(new alumno(nombre, nota));

                //Alumno 3
                nombre = "Carlos";
                nota = 4;
                listaAlumnos.add(new alumno(nombre, nota));

                //Alumno 4
                nombre = "Elvira";
                nota = 6;
                listaAlumnos.add(new alumno(nombre, nota));

                //Alumno 5
                nombre = "Francisco";
                nota = 0;
                listaAlumnos.add(new alumno(nombre, nota));

                //Alumno 6
                nombre = "Paco";
                nota = 2;
                listaAlumnos.add(new alumno(nombre, nota));

            System.out.println("* Los alumnos y sus notas fueron añadidas correctamente.");
            System.out.println();
        }
    }


    // Método que muestra todas las notas.
    public static void verNotas(ArrayList<alumno> listaAlumnos){
        if(listaAlumnos.isEmpty()) {
            System.err.println("NO HAY NOTAS QUE MOSTRAR, añádalas con la opción 2.");
            System.out.println();
        }else{
            System.out.println("***** LISTA DE ALUMNOS ******");
            int nNota = 1;
            for (alumno a : listaAlumnos) {
                System.out.println("NOTA " + nNota + ": " + a.getNombre() + " " + a.getNota());
                nNota++;
            }
            System.out.println();
        }
    }


    // Método que borra un elemento del arrayList alumnos.
    public static void borrarAlumno(ArrayList<alumno> listaAlumnos) throws IOException {
        if(listaAlumnos.isEmpty()) {
            System.err.println("NO HAY NOTAS QUE MOSTRAR, añádalas con la opción 2.");
            System.out.println();
        }else {
            System.out.println("********* BORRAR ALUMNO *********");
            System.out.println("- Introduzca el nombre del alumno que quieres borrar (escríbelo respetando las mayúsculas): ");
            String nombre = bufferedReader.leerString();
            // Con un método comprobamos si existe el alumno, en el caso de existir lo borra. Si no indica que no existe.
            if (inList(listaAlumnos, nombre)) {
                listaAlumnos.removeIf(alumno -> alumno.getNombre().equals(nombre));
            } else {
                System.err.println("El alumno no existe.");
            }
        }
    }




    // Método que muestra las estadísticas (nota media de todos los alumnos, nota máxima y la mínima).
    public static void verEstadisticas(ArrayList<alumno> listaAlumnos){
        if(listaAlumnos.isEmpty()) {
            System.err.println("NO HAY NOTAS QUE MOSTRAR, añádalas con la opción 2.");
            System.out.println();
        }else {
            // En el mismo bucle sumamos para hacer la media, buscamos la nota máxima y la mínima.
            int suma = 0;
            int media;
            int contAlumnos = 0; // Para contar el número de alumnos, ya que el array puede no estar completo.
            int notaMax = listaAlumnos.get(0).getNota();
            int notaMin = listaAlumnos.get(0).getNota();
            for (alumno a : listaAlumnos) {
                suma = suma + a.getNota();
                contAlumnos++;
                if (a.getNota() > notaMax) {
                    notaMax = a.getNota();
                }
                if (a.getNota() < notaMin) {
                    notaMin = a.getNota();
                }
            }
            media = suma / contAlumnos;
            // Mostramos los resultados.
            System.out.println("***** ESTADÍSTICAS *****");
            System.out.println("- MEDIA: " + media);
            System.out.println("- MÁXIMA: " + notaMax);
            System.out.println("- MÍNIMA: " + notaMin);
        }
    }


    // Método que muestra una lista con los alumnos que han suspendido.
    public static void verSuspensos(ArrayList<alumno> listaAlumnos){
        if(listaAlumnos.isEmpty()) {
            System.err.println("NO HAY NOTAS QUE MOSTRAR, añádalas con la opción 2.");
            System.out.println();
        }else {
            System.out.println("***** SUSPENSOS *****");
            for (alumno a : listaAlumnos) {
                if (a.getNota() < 5) {
                    System.out.println("- " + a.getNombre() + ": " + a.getNota());
                }
            }
            System.out.println();
        }
    }

    // Método que comprueba si un alumno está en la lista. Recibe el nombre como parámetro.
    public static boolean inList(ArrayList<alumno> listaAlumnos, String nombre){
        boolean inList = false;
        for(alumno a : listaAlumnos){  //Comprobamos que el nombre introducido existe en la lista de alumnos.
           // De la forma como hice, hay que poner el nombre tal como es, con mayúsculas si tiene, si no, no funciona.
            if (a.getNombre().equals(nombre)) {
                inList = true;
                break;
            }
        }
        return inList;
    }

    // Comprobar si la lista de alumnos está llena, es decir, que ya tiene los 100 alumnos de máximo.
    static boolean arrayIsFull(ArrayList<alumno> listaAlumnos){
        boolean isFull = false;
        int c = 0;
        for (alumno a : listaAlumnos) {
            if (a != null) {
                c++;
            }
        }
        if(c==100) isFull = true;
        return isFull;
    }


}