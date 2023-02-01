package busquedaOrdenaciones;
/*
* Ordenar un array es muy importante, ya sea de números o de cadenas, puede haber casos en que nos interese que los datos estén ordenados en un array.
* Tenemos varias formas de hacerlo, tanto con números como con cadenas:


* */
public class OrdenacionIntercambioArray {

    /**
     * Intercambio: consiste en comparar el primer valor con el resto de las posiciones posteriores,
     * cambiando el valor de las posiciones en caso de que el segundo sea menor que el primero comparado,
     * después la segunda posición con el resto de posiciones posteriores.
     */

    public static void main(String[] args) {
        final int TAMANIO=10;
        int lista[]=new int [TAMANIO];
        rellenarArray(lista);

        String lista_String[]={"americano", "Zagal", "pedro", "Tocado", "coz"};

        System.out.println("Array de números sin ordenar:");
        imprimirArray(lista);

        //ordenamos el array
        intercambio(lista);

        System.out.println("Array de números ordenado:");
        imprimirArray(lista);

        System.out.println("Array de String sin ordenar:");
        imprimirArray(lista_String);

        //ordenamos el array
        intercambioPalabras(lista_String);

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

    public static void intercambio(int [] lista){
        //Usamos un bucle anidado
        for(int i=0;i<(lista.length-1);i++){
            for(int j=i+1;j<lista.length;j++){
                if(lista[i]>lista[j]){
                    //Intercambiamos valores
                    int variableauxiliar=lista[i];
                    lista[i]=lista[j];
                    lista[j]=variableauxiliar;

                }
            }
        }
    }

    public static void intercambioPalabras(String lista[]){

        //Usamos un bucle anidado
        for(int i=0;i<(lista.length-1);i++){
            for(int j=i+1;j<lista.length;j++){
                if(lista[i].compareToIgnoreCase(lista[j])>0){
                    //Intercambiamos valores
                    String variableauxiliar=lista[i];
                    lista[i]=lista[j];
                    lista[j]=variableauxiliar;

                }
            }
        }
    }
}
