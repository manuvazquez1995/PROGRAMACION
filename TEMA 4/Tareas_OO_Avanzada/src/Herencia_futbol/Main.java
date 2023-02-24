package Herencia_futbol;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {



    // ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, 28489);
        SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        SeleccionFutbol raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);

        // CONCENTRACION
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.concentrarse();
        }

        // VIAJE
        System.out.println("nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.viajar();
        }

//      .........

        // ENTRENAMIENTO
        System.out.println("nEntrenamiento: Todos los integrantes tienen su función en un entrenamiento (Especialización)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.entrenamiento();
        }

// PARTIDO DE FUTBOL
        System.out.println("nPartido de Fútbol: Todos los integrantes tienen su función en un partido (Especialización)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.partidoFutbol();
        }
//     ........

//	      ........
// PLANIFICAR ENTRENAMIENTO
        System.out.println("nPlanificar Entrenamiento: Solo el entrenador tiene el método para planificar un entrenamiento:");
        System.out.print(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
        ((Entrenador) delBosque).planificarEntrenamiento();

// ENTREVISTA
        System.out.println("nEntrevista: Solo el futbolista tiene el método para dar una entrevista:");
        System.out.print(iniesta.getNombre() + " " + iniesta.getApellidos() + " -> ");
        ((Futbolista) iniesta).entrevista();

// MASAJE
        System.out.println("nMasaje: Solo el masajista tiene el método para dar un masaje:");
        System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
        ((Masajista) raulMartinez).darMasaje();
        //	      ........

        System.out.println("""
                
                *******************************************************************************************
                *******************************************************************************************
                *******************************************************************************************
                """);
        // TODO: RESULTADOS DEL EJERCICIO (MI PARTE).
        //mostrarIntregFor(integrantes);
        integrantesIterador(integrantes);
    }

    /**
     * This method inputs a number from the user.
     * @return The value input as a double.
     */
    public double square(double num) {
        return num * num;
    }


    // TODO: AQUÍ EMPIEZA EL EJERCICIO DE TAREAS_OO_AVANZADA.
    // todo: MÉTODOS PARA HACER UN RECORRIDO POR EL arrayList DE INTEGRANTES(for,foreach, iterator).
    //Con for normal.
    public static void mostrarIntregFor(ArrayList<SeleccionFutbol> integrantes){
        for(int i=0; i<integrantes.size(); i++){
            System.out.println(integrantes.get(i).id+"  "+integrantes.get(i).nombre+"  "+integrantes.get(i).apellidos+"  "+integrantes.get(i).edad);
        }
    }

    // Con for-each
    public static void integrantesIterador(ArrayList<SeleccionFutbol> integrantes){

        int cFutbolistas = 0;
        int cEntrenadores = 0;
        int cMasajistas = 0;

        Iterator<SeleccionFutbol> iterador = integrantes.iterator();

        for(SeleccionFutbol i : integrantes){
            while(iterador.hasNext()){
                SeleccionFutbol it = iterador.next();
                if(it instanceof Futbolista){
                    System.out.println(it.getId()+" "+it.getNombre()+" "+it.apellidos+" ES FUTBOLISTA");
                    cFutbolistas++;
                } else if (it instanceof Entrenador) {
                    System.out.println(it.getId()+" "+it.getNombre()+" "+it.apellidos+" ES ENTRENADOR");
                    cEntrenadores++;
                } else if (it instanceof Masajista) {
                    System.out.println(it.getId()+" "+it.getNombre()+" "+it.apellidos+" ES MASAJISTA");
                    cMasajistas++;
                }
            }
        }
        System.out.println();
        System.out.println("* Futbolistas: "+cFutbolistas);
        System.out.println("* Entrenadores: "+cEntrenadores);
        System.out.println("* Masajistas: "+cMasajistas);
    }



}

/*
 * This method inputs a number from the user.
 * @return The value input as a double.
 * @exception IOException On input error.
 * @see IOException
 */
