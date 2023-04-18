package Listas_Pilas_Colas.Cine;

import java.util.ArrayList;

public class Principal_Con_ArrayList {


    public static void main(String[] args) {

        // Declaramos un arrayList donde se guardará las personas que compraron la entrada del cine.
        ArrayList<Persona> cola = new ArrayList<>();

        // Generamos el número de personas que entran en la cola con sus respectivas edades (número aleatório, con método).
        generarPersonas(cola);

        // Recorremos una cola para calcular la cantidad total recaudada (con método).
        calcular(cola);

    }



    // Método que genera aleatoriamente en número de personas con su edead.
    public static void generarPersonas(ArrayList<Persona> cola){

        //Generamos primero el número de personas (entre 1 y 50).
        int numPersonas = generaNumeroAleatorio(1,50);

        // Creamos las personas indicadas en el número aleatorio con su respetiva edad (otro aleatorio).
        for(int i=0; i<numPersonas; i++){

            // Generamos la edad entre 5 y 60.
            int edad = generaNumeroAleatorio(5,60);

            // Creamos la persona guardándolo directamente en el arrayList.
                cola.add(new Persona(edad));
        }
    }


    // Método que calcula el total recaudado recorriendo la cola. También usa mensajes de traza para saber si la recaudación está bien.
    public static void calcular(ArrayList<Persona> cola){

        // Atributo para guardar el total de lo recaudado.
        double recaudacion = 0;

        // Recorremos el arrayList para extraer las edades y hacer cálculos en base ellas.
        System.out.println("******* Personas ********");
        for(Persona p : cola){

            // Leemos la edad de cada elemento.
            int edadP = p.getEdad();


            // En base la edad de la persona, calculamos el total recaudado.
            if(edadP >= 5 && edadP <= 10){
                System.out.println("- Edad: "+edadP+"   (precio 1€)");
                recaudacion += 1;
            } else if (edadP >= 11 && edadP <= 17) {
                System.out.println("- Edad: "+edadP+"   (precio 2.5€)");
                recaudacion += 2.5;
            } else if (edadP >= 18) {
                System.out.println("- Edad: "+edadP+"   (precio 3.5€)");
                recaudacion += 3.5;
            }

        }

        // Mostramos la recaudación.
        System.out.println();
        System.out.println("* RECAUDADO: "+ recaudacion);

    }


    // Método para generar un número aleatorio entre un rango.
    public static int generaNumeroAleatorio(int minimo, int maximo){

        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));

    }



}