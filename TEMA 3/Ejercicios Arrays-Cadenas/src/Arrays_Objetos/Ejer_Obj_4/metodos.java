package Arrays_Objetos.Ejer_Obj_4;


import java.util.Arrays;

public class metodos {

    //Método que imprime las opciones del menú.
    public static void menu(){
        System.out.println("""
                ********* CONCESIONARIO *********
                (1) Cargar coche.
                (2) Visualizar listado ordenado de coches.
                (3) Coche más caro.
                (4) Hacer búsqueda.
                (5) Ver todos los coches.
                (0) Salir.
                Introduce una opción:
                """);
        System.out.println();
    }


    // Método para imprimir las opciones del menú de búsqueda (opción 4 del menú principal).
    public static void menuBusqueda(){
        System.out.println("""
                ******* Busquedas *******
                ¿Como desea buscar?
                (1) Por marca.
                (2) Por precio.
                (3) Volver al menú principal.
                Escoja una opción:
                """);
        System.out.println();
    }


    //Metodo para visualizar el contenido del concesionario.
    public static void mostrarConcesionario(coche[] concesionario){
        for (coche c : concesionario) {
            System.out.println("*****************************************\n" +
                    "- MARCA: " + c.getMarca() + "\n" +
                    "- MODELO: " + c.getModelo() + "\n" +
                    "- PRECIO BASE: " + c.getPrecio_base() + "\n" +
                    "- AIRE ACONDICIONADO: " + c.getAire_acondicionado() + "\n" +
                    "- CIERRE CENTRAL: " + c.getCierre_central() + "\n" +
                    "- PINTURA METALIZADA: " + c.getPintura_metalizada() + "\n" +
                    "- TIPO MOTOR: " + c.getTipo_motor());
            System.out.println();
        }
    }


    // Para ordenar por marca, orden alfabético (método burbuja).
    public static void ordenarPorMarca (coche[] concesionario){
        boolean ordenado=false;
        int cuentaIntercambios=0;
        //Usamos un bucle anidado, saldra cuando esté ordenado el array
        while(!ordenado){
            for(int i=0;i<concesionario.length-1;i++){
                // TODO: en este caso, compareToIgnoreCase sirve para comparar si dos palabras son iguales.
                if (concesionario[i].getMarca().compareToIgnoreCase(concesionario[i+1].getMarca())>0){
                    //Intercambiamos valores
                    coche aux=concesionario[i];
                    concesionario[i]=concesionario[i+1];
                    concesionario[i+1]=aux;
                    //indicamos que hay un cambio
                    cuentaIntercambios++;
                }
            }
            //Si no hay intercambios, es que está ordenado.
            if (cuentaIntercambios==0){
                ordenado=true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cuentaIntercambios=0;
        }
    }


    // Para ordenar por precio DE MAYOR A MENOR (método burbuja).
    public static void ordenarPorPrecioMaxMin(coche[] concesionario){
        int cuentaintercambios=0;
        //Usamos un bucle anidado, saldra cuando esté ordenado el array
        for (boolean ordenado=false;!ordenado;){ //Todo: en este se inicializa con un boolean a falso y lo hace mientras siga siendo falso.
            for (int i=0;i<concesionario.length-1;i++){
                if (concesionario[i].getPrecio_base()<concesionario[i+1].getPrecio_base()){
                    //Intercambiamos valores
                    coche variableauxiliar=concesionario[i];
                    concesionario[i]=concesionario[i+1];
                    concesionario[i+1]=variableauxiliar;
                    //indicamos que hay un cambio
                    cuentaintercambios++;
                }
            }
            //Si no hay intercambios, es que esté ordenado.
            if (cuentaintercambios==0){
                ordenado=true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cuentaintercambios=0;
        }
    }


    // Para ordenar por precio DE MENOR A MAYOR para la búsqueda dicotómica por precio (método burbuja).
    public static void ordenarPorPrecioMinMax(coche[] concesionario){
        int cuentaintercambios=0;
        //Usamos un bucle anidado, saldra cuando esté ordenado el array
        for (boolean ordenado=false;!ordenado;){ //Todo: en este se inicializa con un boolean a falso y lo hace mientras siga siendo falso.
            for (int i=0;i<concesionario.length-1;i++){
                if (concesionario[i].getPrecio_base()>concesionario[i+1].getPrecio_base()){
                    //Intercambiamos valores
                    coche variableauxiliar=concesionario[i];
                    concesionario[i]=concesionario[i+1];
                    concesionario[i+1]=variableauxiliar;
                    //indicamos que hay un cambio
                    cuentaintercambios++;
                }
            }
            //Si no hay intercambios, es que esté ordenado.
            if (cuentaintercambios==0){
                ordenado=true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cuentaintercambios=0;
        }
    }


    //Búsqueda binaria o dicotómica para buscar por precio (hay que ordenarlos de menor a mayor previamente para que funcione).
    public static void busquedaBinPrecio(coche[] sortedArray, int key, int low, int high) {

        int index = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (sortedArray[mid].getPrecio_base() < key) {
                low = mid + 1;
            } else if (sortedArray[mid].getPrecio_base() > key) {
                high = mid - 1;
            } else if (sortedArray[mid].getPrecio_base() == key) {
                index = mid;
                break;
            }
        }
        if(index!=Integer.MAX_VALUE){
            System.out.println("ENCONTRADO");
            System.out.println();
        }else{
            System.err.println("NO ENCONTRADO");
            System.out.println();
        }
    }


    // Búsqueda binaria o dicotómica para buscar por marca (hay que ordenarlos por orden alfabético previamente para que funcione).
    public static void busquedaBinMarca(coche[] sortedArray, String  key, int low, int high) {

        int index = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (sortedArray[mid].getMarca().compareToIgnoreCase(key) < 0) {
                low = mid + 1;
            } else if (sortedArray[mid].getMarca().compareToIgnoreCase(key) > 0) {
                high = mid - 1;
            } else if (sortedArray[mid].getMarca().compareToIgnoreCase(key) == 0) {
                index = mid;
                break;
            }
        }
        if(index!=Integer.MAX_VALUE){
            System.out.println("ENCONTRADO");
            System.out.println();
        }else{
            System.err.println("NO ENCONTRADO");
            System.out.println();
        }
    }


}