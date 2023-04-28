package Ejer_4;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Methods {


    // Método para guardar los datos de los vehículos en un fichero, todo (no guarda objetos, sino sus datos).
    public static void guardarVehiculos(ArrayList<Vehiculo> v, String rutaFichero) throws IOException {

        // Declaramos el flujo de datos de salida, que será el archivo que hace de almacén (datos.dat).
        DataOutputStream out = null;

        try {
            // Abrimos el flujo de datos sobre el fichero de guardado.
            out = new DataOutputStream(new FileOutputStream(rutaFichero));

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
        DataOutputStream in = null;

        // Leemos los datos de los clientes, en la misma orden en la que los escribimos.
        in = new DataOutputStream(new FileOutputStream(rutaFichero));

        // TODO: ME QUEDÉ AQUÍ.


    }








}