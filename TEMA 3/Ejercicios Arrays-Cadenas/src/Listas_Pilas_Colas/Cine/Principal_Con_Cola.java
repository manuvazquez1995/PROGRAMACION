package Listas_Pilas_Colas.Cine;

public class Principal_Con_Cola {

    public static void main(String[] args) {

        // Inicializamos la pila donde se guardará las personas que compraron la entrada del cine.
        ListaEnlazada<Persona> cola = new ListaEnlazada<>();

        // Generamos el número de personas que entran en la cola con sus respectivas edades (número aleatório, con método).
        generarPersonas(cola);

        // Recorremos una cola para calcular la cantidad total recaudada (con método).
        calcular(cola);

    }



    // Método que genera aleatoriamente en número de personas con su edead.
    public static void generarPersonas(ListaEnlazada<Persona> cola){

        //Generamos primero el número de personas (entre 1 y 50).
        int numPersonas = generaNumeroAleatorio(1,50);

        // Creamos las personas indicadas en el número aleatorio con su respetiva edad (otro aleatorio).
        for(int i=0; i<numPersonas; i++){

            // Generamos la edad entre 5 y 60.
            int edad = generaNumeroAleatorio(5,60);

            /* Creamos la persona guardándolo directamente en la cola, si es la primera persona
            a insertar, hace una acción y si no otra distinta. */
            if(i==0){
                cola.insertarPrimero(new Persona(edad));
            }else{
                cola.insertarUltimo(new Persona(edad));
            }

        }
    }


    // Método que calcula el total recaudado recorriendo la cola. También usa mensajes de traza para saber si la recaudación está bien.
    public static void calcular(ListaEnlazada<Persona> cola){

        // Atributo para guardar el total de lo recaudado.
        double recaudacion = 0;

        // Extraemos los datos de la pila, a medida que vamos leyéndolos los vamos borrando.
        System.out.println("******* Personas ********");
        do{

            // Leemos el elemento.
            int edadP = cola.devolverPrimero().getEdad();


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

            // Quitamos elemento de la lista, ya que ha sido procesado.
            cola.quitarPrimero();

        }while(!cola.estaVacia()); // Hace esto asta que la cola está vacía.

        // Mostramos la recaudación.
        System.out.println();
        System.out.println("* RECAUDADO: "+ recaudacion);

    }


    // Método para generar un número aleatorio entre un rango.
    public static int generaNumeroAleatorio(int minimo, int maximo){

        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));

    }



}