package busquedaOrdenaciones;

public class OrdenacionBurbuja {
    /*
    Burbuja: consiste en comparar el primero con el segundo, si el segundo es menor que el primero se intercambian los valores.
    Después el segundo con el tercero y así sucesivamente, cuando no haya ningún intercambio, el array estará ordenado.
    Lo peor de este método de ordenación, es que tiene una complejidad de O(n2) haciendo que cuanto más valores a ordenar mayor tiempo tardara en ordenar.
    * */

    public static void main(String[] args) {

        final int TAMANIO=10;
        int lista[]=new int [TAMANIO];
        rellenarArray(lista);

        String lista_String[]={"americano", "Zagal", "pedro", "Tocado", "coz"};

        System.out.println("Array de números sin ordenar:");
        imprimirArray(lista);

        //ordenamos el array
        burbuja(lista);

        System.out.println("Array de números ordenado:");
        imprimirArray(lista);

        System.out.println("Array de String sin ordenar:");
        imprimirArray(lista_String);

        //ordenamos el array
        burbujaPalabras (lista_String);

        System.out.println("Array de String ordenado:");
        imprimirArray(lista_String);
    }

    public static void imprimirArray (int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }

    public static void imprimirArray (String lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }

    public static void rellenarArray (int lista[]){
        for(int i=0;i<lista.length;i++){
            lista[i]=numeroAleatorio();
        }
    }

    private static int numeroAleatorio (){
        return ((int)Math.floor(Math.random()*1000));
    }

    public static void burbuja (int lista[]){
        int cuentaintercambios=0;
        //Usamos un bucle anidado, saldra cuando este ordenado el array
        for (boolean ordenado=false;!ordenado;){
            for (int i=0;i<lista.length-1;i++){
                if (lista[i]>lista[i+1]){
                    //Intercambiamos valores
                    int variableauxiliar=lista[i];
                    lista[i]=lista[i+1];
                    lista[i+1]=variableauxiliar;
                    //indicamos que hay un cambio
                    cuentaintercambios++;
                }
            }
            //Si no hay intercambios, es que esta ordenado.
            if (cuentaintercambios==0){
                ordenado=true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cuentaintercambios=0;
        }
    }

    public static void burbujaPalabras (String lista_palabras[]){
        boolean ordenado=false;
        int cuentaIntercambios=0;
        //Usamos un bucle anidado, saldra cuando este ordenado el array
        while(!ordenado){
            for(int i=0;i<lista_palabras.length-1;i++){
                if (lista_palabras[i].compareToIgnoreCase(lista_palabras[i+1])>0){
                    //Intercambiamos valores
                    String aux=lista_palabras[i];
                    lista_palabras[i]=lista_palabras[i+1];
                    lista_palabras[i+1]=aux;
                    //indicamos que hay un cambio
                    cuentaIntercambios++;
                }
            }
            //Si no hay intercambios, es que esta ordenado.
            if (cuentaIntercambios==0){
                ordenado=true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cuentaIntercambios=0;
        }

    }
}
