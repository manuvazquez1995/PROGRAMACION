package Ejer_4;
import java.io.*;
import java.util.ArrayList;

public class Methods {


    // Método para guardar los datos de los vehículos en un fichero, todo (no guarda objetos, sino sus datos).
    public static void guardarVehiculos(ArrayList<Vehiculo> v, String rutaFichero) throws IOException {

        // Declaramos el flujo de datos de salida, que será el archivo que hace de almacén (datos.dat).
        DataOutputStream out = null;

        try {
            // Abrimos el flujo de datos sobre el fichero de guardado.
            out = new DataOutputStream(new FileOutputStream(rutaFichero, true)); // Este true sirve para no sobrescribir los datos ya existentes en el archivo.

            // Escribimos en el fichero los atributos de cada vehículo, no guarda los objetos.
            for(Vehiculo ve : v){
                out.writeUTF(ve.getMatricula());
                out.writeUTF(ve.getMarca());
                out.writeDouble(ve.getTamDeposito());
                out.writeUTF(ve.getModelo());
            }

        }finally {
            // Cerramos el Stream de salida.
            if(out != null){
                out.close();
            }
        }

    }



    // Método para leer los datos de los vehículos guardados en un fichero.
    public static void leerVehiculos (String rutaFichero) throws IOException {

        // Declaramos el flujo de datos de entrada.
        DataInputStream in = null;

        try{

            // Leemos los datos de los clientes, en la misma orden en la que los escribimos.
            in = new DataInputStream(new FileInputStream(rutaFichero));

            try {

                while(true){
                    Vehiculo vehiculo = new Vehiculo();
                    vehiculo.setMatricula(in.readUTF());
                    vehiculo.setMarca(in.readUTF());
                    vehiculo.setTamDeposito(in.readDouble());
                    vehiculo.setModelo(in.readUTF());
                    vehiculo.show();  // Método que está en la clase vehículo.
                }

            }catch (EOFException e){
               //System.err.println("- ERROR: "+e);
            }

        }finally {
            if(in != null){
                in.close();
            }
        }


    }



    // Método para guardar los datos de un vehículo en el fichero, todo (no guarda objetos, sino sus datos).
    public static void guardarVehiculos(Vehiculo v, String rutaFichero) throws IOException {

        // Declaramos el flujo de datos de salida, que será el archivo que hace de almacén (datos.dat).
        DataOutputStream out = null;

        try {
            // Abrimos el flujo de datos sobre el fichero de guardado.
            out = new DataOutputStream(new FileOutputStream(rutaFichero, true));

            // Escribimos en el fichero los atributos de cada vehículo, no guarda los objetos.
            out.writeUTF(v.getMatricula());
            out.writeUTF(v.getMarca());
            out.writeDouble(v.getTamDeposito());
            out.writeUTF(v.getModelo());


        }finally {
            // Cerramos el Stream de salida.
            if(out != null){
                out.close();
            }
        }

    }



}