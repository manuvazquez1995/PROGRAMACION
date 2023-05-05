import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class OperacionesAnimales {

    // String donde se guarda la ruta del fichero de datos.
    static String fichero = "F:\\PROGRAMACION\\TEMA 5\\EjercicioFicheros_SerializacionObjPolimorfismo\\src\\datos.dat";


    // Arrays donde se guardarán los perros y los gatos.
    static ArrayList<Perro> perros = new ArrayList<>();
    static ArrayList<Gato> gatos = new ArrayList<>();


    // Métodos que comprueban que los arrayList tiene 5 elementos, para evitar que se
    // añadan más animales si ya se guardaron 5 en cada arrayList (para perros y gatos).
    public static boolean isFullPerros(ArrayList<Perro> perros){
        boolean isFull = perros.size() >= 5;
        return isFull;
    }

    public static boolean isFullGatos(ArrayList<Gato> gatos){
        boolean isFull = gatos.size() >= 5;
        return isFull;
    }


    // Método que guarda perros en un array.
    public static boolean addPerro(Perro perro){
        boolean isSave = false;
        if(!isFullPerros(perros)){
            perros.add(perro);
            isSave = true;
        }
        return isSave;
    }


    // Método que guarda gatos en un array.
    public static boolean addGato(Gato gato){
        boolean isSave = false;
        if(!isFullGatos(gatos)){
            gatos.add(gato);
            isSave = true;
        }
        return isSave;
    }


    // Método para fusionar los 2 arrayList en uno de tipo arrayList Animal.
    public static ArrayList<Animal> fusionarArrayList(ArrayList<Perro> perros, ArrayList<Gato> gatos){
        ArrayList<Animal> animales = new ArrayList<>();
        // Añadimos los perros y los gatos.
        animales.addAll(perros);
        animales.addAll(gatos);
        return animales;
    }


    // Método que guarda los objetos de los 2 arrays en un fichero de datos.
    public static void guardarAnimalesADisco(String fichero) throws IOException {

        // Primero pasamos los objetos de los 2 arrayList en uno auxiliar de tipo Animal.
        ArrayList<Animal> animales = new ArrayList<>();
        animales = fusionarArrayList(perros, gatos);

        // Declaramos el flujo de datos de salida.
        ObjectOutputStream out = null;

        try{
            // Abrimos el flujo de datos sobre el fichero.
            out = new ObjectOutputStream(new FileOutputStream(fichero));
            // Escribimos en la salida los animales.
            out.writeObject(animales);
        }finally {
            // En cualquier caso, de producirse un erro o no, se cierra el flujo de salida si está abierto.
            if(out != null){
                out.close();
            }
        }
    }


    // Método que lee los animales guardados en el fichero.
    public static void leerAnimalesDisco(String fichero){



    }






}