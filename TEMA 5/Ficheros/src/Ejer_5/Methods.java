package Ejer_5;
import java.io.*;
import java.util.ArrayList;

public class Methods {


    // Método que guarda los vehículos de un array.
    public static void saveVehicles(ArrayList<Vehiculo> vehiculos, String destFilePath)
            throws IOException {
        // Declaramos o fluxo de datos de saída
        ObjectOutputStream out = null;
        //MiObjectOutputStream out2 = null;
        try {
            // Abrimos o fluxo de datos sobre o ficheiro
            out = new ObjectOutputStream(new FileOutputStream(destFilePath));
            // Escribimos na saída os clientes
            out.writeObject(vehiculos);
        } finally {
            // En calquera caso, producirase ou non unha excepción, pechamos o
            // fluxo de saída se está aberto
            if (out != null) {
                out.close();
            }
        }
    }


    // Método que muestra todos los vehículos de un fichero.
    public static void showVehicles(String sourceFilePath)
            throws IOException, ClassNotFoundException {
        // Declaramos o fluxo de datos de entrada
        ObjectInputStream in = null;
        try {
            // Abrimos o fluxo de datos sobre o ficheiro

            in = new ObjectInputStream(new FileInputStream(sourceFilePath));
            // Lemos a colección de clientes
            ArrayList<Vehiculo> vehiculos;
            vehiculos = (ArrayList<Vehiculo>) in.readObject();
            for (Vehiculo ve : vehiculos) {
                ve.show();
            }

        } finally {
            // En calquera caso, producirase ou non unha excepción, pechamos o
            // fluxo de entrada se está aberto
            if (in != null) {
                in.close();
            }
        }
    }



    // Método que guarda los clientes, para ello mandamos todos los clientes en un arrayList porque así se actualiza en cada acceso.
    public static void saveVehiclesOneByOne(ArrayList<Vehiculo> vehiculos, String destFilePath) throws IOException {
        //Declaramos el flujo da datos de salida.
        ObjectOutputStream out = null, out1 = null;
        try{

            if(new File(destFilePath).length()!=0){
                // Abrimos el flujo da datos sobre el fichero.
                out1 = new MyObjectOutputStream(new FileOutputStream(destFilePath, new File(destFilePath).exists()));
                // Escribimos en la salida los vehículos.
                for(Vehiculo v : vehiculos){
                    out1.writeObject(v);
                }
            }else{
                // Abrimos el flujo de datos sobre el fichero.
                out = new ObjectOutputStream(new FileOutputStream(destFilePath, new File(destFilePath).exists()));
                // Escribimos en la salida los clientes.
                for(Vehiculo v : vehiculos){
                    out.writeObject(v);
                }
            }

        }finally {
            // Cerramos el flujo de salida si está abierto.
            if (out != null){
                out.close();
            }
            if(out1 != null){
                out1.close();
            }
        }
    }



    // Método que muestra los vehículos del fichero uno a uno.
    public static void showVehiclesOneByOne(String sourceFilePath) throws IOException {
        // Declaramos el flujo de datos de entrada.
        ObjectInputStream in = null;
        try{
            // Abrimos el flujo da datos sobre el fichero.
            in = new ObjectInputStream(new FileInputStream(sourceFilePath));
            // Leemos los datos de los vehículos, en la misma orden en la que los escribimos,
            // asta que se produzca la excepción de fin de fichero.
            try{
                while (true){
                 Vehiculo ve = (Vehiculo) in.readObject();
                 ve.show();
                }
            }catch (EOFException e){
                System.err.println("Fin del fichero.");
            }catch (ClassNotFoundException e){
                throw new RuntimeException(e);
            }
        }finally{
            // Cerramos los flujos de entrada por si están abiertos.
            if(in != null){
                in.close();
            }
        }
    }


}