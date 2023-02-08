import java.io.IOException;

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
    public static void crearAlumno(alumno[] listaAlumnos) throws IOException {
        if(arrayIsFull(listaAlumnos)){
            System.err.println("ERROR: La lista de alumnos está completa.");
        }else{
            System.out.println("*** NUEVO ALUMNO ***");
            System.out.println("- Introduzca el nombre: ");
            String nombre = bufferedReader.leerString();
            System.out.println("- Introduzca la nota: ");
            int nota = bufferedReader.leerInt();
            while (esNeg(nota)) {
                System.err.println("La nota no puede ser negativa.");
                System.out.println("Introduzca una nota válida.");
                nota = bufferedReader.leerInt();
            }
            // Creamos el objeto alumno con los datos anteriormente pedidos.
            alumno alumno = new alumno(nombre, nota);
            //El siguiente for sirve para que guarde el alumno en la primera posición del array que esté libre.
            boolean alumnoGuardado = false;
            for (int i = 0; !alumnoGuardado; i++) {
                if (listaAlumnos[i] == null) {
                    listaAlumnos[i] = alumno;
                    alumnoGuardado = true;
                    System.out.println("* El alumno fue guardado correctamente.");
                }
            }
            System.out.println();
        }
    }


    // Método que muestra todas las notas.
    public static void verNotas(alumno[] listaAlumnos){
        System.out.println("***** LISTA DE ALUMNOS ******");
        for(int i=0; listaAlumnos[i]!=null ; i++){
            System.out.println("NOTA "+i+": "+listaAlumnos[i].getNombre()+" "+listaAlumnos[i].getNota());
        }
        System.out.println();
    }


    // Método que muestra las estadísticas (nota media de todos los alumnos, nota máxima y la mínima).
    public static void verEstadisticas(alumno[] listaAlumnos){
        // En el mismo bucle sumamos para hacer la media, buscamos la nota máxima y la mínima.
        int suma = 0;
        int media;
        int contAlumnos = 0; // Para contar el número de alumnos, ya que el array puede no estar completo.
        int notaMax = listaAlumnos[0].getNota();
        int notaMin = listaAlumnos[0].getNota();
        for(int i=0; listaAlumnos[i]!=null; i++){
            suma = suma + listaAlumnos[i].getNota();
            contAlumnos++;
            if(listaAlumnos[i].getNota()>notaMax){
                notaMax = listaAlumnos[i].getNota();
            }
            if(listaAlumnos[i].getNota()<notaMin){
                notaMin = listaAlumnos[i].getNota();
            }
        }
        media = suma / contAlumnos;
        // Mostramos los resultados.
        System.out.println("***** ESTADÍSTICAS *****");
        System.out.println("- MEDIA: "+media);
        System.out.println("- MÁXIMA: "+notaMax);
        System.out.println("- MÍNIMA: "+notaMin);
    }


    // Método que muestra una lista con los alumnos que han suspendido.
    public static void verSuspensos(alumno[] listaAlumnos){
        System.out.println("***** SUSPENSOS *****");
        for(int i=0; listaAlumnos[i]!=null; i++){
            if(listaAlumnos[i].getNota()<5){
                System.out.println("- "+listaAlumnos[i].getNombre()+": "+listaAlumnos[i].getNota());
            }
        }
        System.out.println();
    }


    //Método que comprueba si un número es negativo.
    public static boolean esNeg(int num){
        boolean esNeg = false;
        if(num<0){
            esNeg = true;
        }
        return esNeg;
    }


    // Comprobar si la lista de alumnos está llena.
    static boolean arrayIsFull(alumno[] listaAlumnos){
        boolean isFull = true;
        for (alumno listaAlumno : listaAlumnos) {
            if (listaAlumno == null) {
                isFull = false;
                break;   // En el momento que encuentra una posición vacía en el array, rompe y ya devuelve false.
            }
        }
        return isFull;
    }





}