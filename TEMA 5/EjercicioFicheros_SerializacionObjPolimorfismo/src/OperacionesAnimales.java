import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class OperacionesAnimales {

    // Arrays donde se guardarán los perros y los gatos.
    static ArrayList<Perro> perros = new ArrayList<>();
    static ArrayList<Gato> gatos = new ArrayList<>();


    // Métodos que comprueban que los arrayList tiene 5 elementos, para evitar que se
    // añadan más animales si ya se guardaron 5 en cada arrayList (para perros y gatos).
    public boolean isFullPerros(ArrayList<Perro> perros){
        boolean isFull = perros.size() >= 5;
        return isFull;
    }

    public boolean isFullGatos(ArrayList<Gato> gatos){
        boolean isFull = gatos.size() >= 5;
        return isFull;
    }


    // Método que guarda perros en un array.
    public boolean addPerro(Perro perro){
        boolean isSave = false;
        if(!isFullPerros(perros)){
            perros.add(perro);
            isSave = true;
        }
        return isSave;
    }


    // Método que guarda gatos en un array.
    public boolean addGato(Gato gato){
        boolean isSave = false;
        if(!isFullGatos(gatos)){
            gatos.add(gato);
            isSave = true;
        }
        return isSave;
    }


    // Método para fusionar los 2 arrayList en uno de tipo arrayList Animal.
    public ArrayList<Animal> fusionarArrayList(ArrayList<Perro> perros, ArrayList<Gato> gatos){
        ArrayList<Animal> animales = new ArrayList<>();
        // Añadimos los perros y los gatos.
        animales.addAll(perros);
        animales.addAll(gatos);
        return animales;
    }


    // Método que guarda los objetos de los 2 arrays en un fichero de datos.
    public void guardarAnimalesADisco(String fichero) throws IOException {

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
            System.out.println("- Los animales han sido guardados o actualizados.");
            System.out.println();
        }finally {
            // En cualquier caso, de producirse un erro o no, se cierra el flujo de salida si está abierto.
            if(out != null){
                out.close();
            }
        }
    }


    // Método que lee los animales guardados en el fichero.
    public void leerAnimalesDisco(String fichero) throws IOException {

        // Declaramos el flujo de datos de entrada.
        ObjectInputStream in = null;
        try{
            // Abrimos el flujo de datos sobre el fichero.
            in = new ObjectInputStream(new FileInputStream(fichero));

            // Leemos la colección de animales.
            ArrayList<Animal> animales;
            animales = (ArrayList<Animal>) in.readObject();

            if(animales.isEmpty()){
                System.out.println("- No hay animales guardados en disco.");
            }else{
                for(Animal a : animales){
                    System.out.println(a.toString());
                    System.out.println(a.expresar());
                    System.out.println();
                }
            }

        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } finally {
            // En cualquier caso, de producirse un erro o no, se cierra el flujo de salida si está abierto.
            if(in != null){
                in.close();
            }
        }
    }


    /* Método que lee los animales guardados en el fichero y los guarda en sus respectivos arrays.
    * Este método solo se utiliza al iniciar la app, para volver a guardar en los animales guardados
    * de la última ejecución del programa. Esto lo hago porque si volvemos a ejecutar, los arrays
    * se inicializan vacíos y cuando se vuelven a guardar en disco, borra los animales de la
    * última ejecución.
    * */
    public void leerYGuardarAnimalesDisco(String fichero) throws IOException {

        // Declaramos el flujo de datos de entrada.
        ObjectInputStream in = null;
        try{
            // Abrimos el flujo de datos sobre el fichero.
            in = new ObjectInputStream(new FileInputStream(fichero));

            // Leemos la colección de animales.
            ArrayList<Animal> animales;
            animales = (ArrayList<Animal>) in.readObject();

            for(Animal a : animales){
                if(Objects.equals(a.getTipo(), "Perro")){
                    perros.add((Perro) a);
                }
                if(Objects.equals(a.getTipo(), "Gato")){
                    gatos.add((Gato) a);
                }
            }

        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } finally {
            // En cualquier caso, de producirse un erro o no, se cierra el flujo de salida si está abierto.
            if(in != null){
                in.close();
            }
        }
    }


    // Método que busca un animal por nombre. Devuelve un objeto animal.
    public Animal existeAnimal(String nombre){
        // Primero pasamos los objetos de los 2 arrayList en uno auxiliar de tipo Animal.
        ArrayList<Animal> animales = new ArrayList<>();
        animales = fusionarArrayList(perros, gatos);
        for(Animal a : animales){
            if(Objects.equals(a.getNombre(), nombre)){
                return a;
            }
        }
        return null;
    }



    // Método que borra un animal, lo hace en el array y luego actualiza el fichero.
    public void borrarAnimal(String nombre, String fichero) throws IOException {
        if(existeAnimal(nombre)==null){
            System.out.println("- El animal con nombre "+nombre+" NO EXISTE.");
            System.out.println();
        }else{
            // Comprobamos que tipo de animal es, para borrarlo en su correspondiente array.
            if(existeAnimal(nombre) instanceof Perro){
                perros.removeIf(animal -> animal.getNombre().equals(nombre));
            } else if (existeAnimal(nombre) instanceof Gato) {
                gatos.removeIf(animal -> animal.getNombre().equals(nombre));
            }
            // Actualizamos el fichero para borrar el animal en él.
            guardarAnimalesADisco(fichero);
            System.out.println("El animal ha sido borrado.");
            System.out.println();
        }
    }


}